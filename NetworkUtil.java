package com.project.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;

import androidx.annotation.NonNull;

public class HSNetworkUtil {
	private static final String LOG_TAG = HSNetworkUtil.class.getSimpleName();

	private static boolean registeredBindCallback = false, registeredUnBindCallback = false;
	private static ConnectivityManager connectivityManager;

	public static void bindToNetwork (Global global) {
		if (connectivityManager == null)
			connectivityManager = (ConnectivityManager)global.getSystemService(Context.CONNECTIVITY_SERVICE);

		if (registeredBindCallback)
			unRegisterBindNetwork(global);
		if (registeredUnBindCallback)
			unRegisterUnBindNetwork(global);

		NetworkRequest.Builder builder;
		builder = new NetworkRequest.Builder();
		builder.removeCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
		builder.removeTransportType(NetworkCapabilities.TRANSPORT_CELLULAR);
		builder.addTransportType(NetworkCapabilities.TRANSPORT_WIFI);

		registeredBindCallback = true;

		connectivityManager.requestNetwork(builder.build(), bindNetworkCallback);
	}

	public static void unBindToNetwork (Global global) {
		if (connectivityManager == null)
			connectivityManager = (ConnectivityManager)global.getSystemService(Context.CONNECTIVITY_SERVICE);

		if (registeredBindCallback)
			unRegisterBindNetwork(global);
		if (registeredUnBindCallback)
			unRegisterUnBindNetwork(global);

		NetworkRequest.Builder builder;
		builder = new NetworkRequest.Builder();
		builder.addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
		builder.addTransportType(NetworkCapabilities.TRANSPORT_CELLULAR);
		builder.addTransportType(NetworkCapabilities.TRANSPORT_WIFI);

		registeredUnBindCallback = true;

		connectivityManager.requestNetwork(builder.build(), unBindNetworkCallback);
	}

	public static ConnectivityManager getConnectivityManager(Global global) {
		if (connectivityManager == null)
			connectivityManager = (ConnectivityManager)global.getSystemService(Context.CONNECTIVITY_SERVICE);

		return connectivityManager;
	}

	public static void unRegisterBindNetwork(Global global) {
		if (!registeredBindCallback)
			return;

		if (connectivityManager == null)
			connectivityManager = (ConnectivityManager)global.getSystemService(Context.CONNECTIVITY_SERVICE);

		registeredBindCallback = false;
		try { connectivityManager.unregisterNetworkCallback(bindNetworkCallback); } catch (Exception e) { }
	}

	public static void unRegisterUnBindNetwork(Global global) {
		if (!registeredUnBindCallback)
			return;

		if (connectivityManager == null)
			connectivityManager = (ConnectivityManager)global.getSystemService(Context.CONNECTIVITY_SERVICE);

		registeredUnBindCallback = false;
		try { connectivityManager.unregisterNetworkCallback(unBindNetworkCallback); } catch (Exception e) { }
	}


	// Callback
	static ConnectivityManager.NetworkCallback bindNetworkCallback = new ConnectivityManager.NetworkCallback() {
		@Override
		public void onAvailable(@NonNull Network network) {
			HSLog.e(LOG_TAG, "bindToNetwork() > onAvailable");

			if (registeredBindCallback) {
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
					connectivityManager.bindProcessToNetwork(network);
				} else {
					ConnectivityManager.setProcessDefaultNetwork(network);
				}
			}
		}

		@Override
		public void onLost(@NonNull Network network) {
			super.onLost(network);

			HSLog.e(LOG_TAG, "bindToNetwork() > onLost");
		}

		@Override
		public void onUnavailable() {
			HSLog.e(LOG_TAG, "bindToNetwork() > onUnavailable");
		}
	};

	static ConnectivityManager.NetworkCallback unBindNetworkCallback = new ConnectivityManager.NetworkCallback() {
		@Override
		public void onAvailable(Network network) {
			HSLog.e(LOG_TAG, "unbindToNetwork() > onAvailable");

			if (registeredUnBindCallback) {
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
					connectivityManager.bindProcessToNetwork(network);
				} else {
					ConnectivityManager.setProcessDefaultNetwork(network);
				}
			}
		}

		@Override
		public void onLost(@NonNull Network network) {
			super.onLost(network);

			HSLog.e(LOG_TAG, "unbindToNetwork() > onLost");
		}

		@Override
		public void onUnavailable() {
			HSLog.e(LOG_TAG, "unbindToNetwork() > onUnavailable");
		}
	};
}
