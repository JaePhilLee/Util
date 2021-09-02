package com.hstelnet.rayhome2.util;

/*
 * Created by 이재필 on 28/06/2019.
 * Copyright © 2019 이재필. All rights reserved.
 * */


/*
 == String for test
    String without duplicates   : <?xml version="1.0" encoding="UTF-8" standalone="yes"?><inquiryinfo><email>jplee@hstelnet.com</email><title>허브 등록 문의</title><category>버그</category><content>허브 등록 버그가 있습니다. 2018.10.01에 발생했습니다. 확인해주세요.</content></inquiryinfo>
    String with duplicates      : <?xml version="1.0" encoding="UTF-8" standalone="yes"?><remotepw><pw>123456</pw><pw>654321</pw><pw>112233</pw><pw>332211</pw></remotepw>
    String for overall testing  : <?xml version="1.0" encoding="UTF-8" standalone="yes"?><smarthome><userinfo><creationtime>2019.03.27 10:45:43+09:00</creationtime><lastmodifiedtime>2019.06.27 09:51:19+09:00</lastmodifiedtime><userid>UI0000000173</userid><email>pok_mod@naver.com</email><password>123456</password><ukey>uuû/ukey><regstatus>0</regstatus><username>이재필</username><ismaster>1</ismaster><masterid></masterid><applanguage>kr</applanguage><permissionstatus>2</permissionstatus><representhub>1.3.6.1.4.1.7345.1.1903900001</representhub><hubs>HU0000012094</hubs><cameras>CAM0000000941</cameras><cameras>CAM0000001172</cameras><buddys>UI0000000194</buddys><buddys>UI0000000207</buddys><buddys>UI0000000061</buddys><facebookuser>n</facebookuser><newsref><issuedate>2019.06.27 09:51:19+09:00</issuedate><hid>HI0000356690</hid><type>1</type><subtype>102</subtype><ukey>6cf2d5fcccf5a82aea7b24c9623a7b2c33a16098818a2d16073750dff0e97c84</ukey><cseid>1.3.6.1.4.1.7345.2.1903900001</cseid><subid>HU0000012208</subid><name>RayHub</name><content>HubinfoDelete</content><description>HubinfoAllDelete</description></newsref></userinfo><hubinfo><creationtime>2019.06.02 16:00:03+09:00</creationtime><lastmodifiedtime>2019.06.12 17:07:48+09:00</lastmodifiedtime><hubid>HU0000012094</hubid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><serial>1905000013</serial><name>RayhomeHub2_1905000013</name><ukey>6cf2d5fcccf5a82aea7b24c9623a7b2c33a16098818a2d16073750dff0e97c84</ukey><connect>1</connect><mode>off</mode><regmode>0</regmode><seq>5</seq><things>0.17.4.1</things><things>0.33.5.1</things><things>0.18.6.1</things><things>0.65.7.1</things><things>0.19.8.1</things><things>0.34.9.1</things><hubbuddys>UI0000000061</hubbuddys><rayhubversion>1.0</rayhubversion><fcmnotification>on</fcmnotification><remotepassword>123456</remotepassword></hubinfo><hubthing><creationtime>2019.06.02 16:00:58+09:00</creationtime><lastmodifiedtime>2019.06.02 16:00:58+09:00</lastmodifiedtime><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><toid>0.17.4.1</toid><cid>CT0000001959</cid><type>17</type><icon>1</icon><name>열림감지기</name><value>1</value><alive>1</alive><battery>100</battery><rssi>88</rssi><reg>0</reg></hubthing><hubthing><creationtime>2019.06.02 19:51:30+09:00</creationtime><lastmodifiedtime>2019.06.02 19:51:30+09:00</lastmodifiedtime><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><toid>0.33.5.1</toid><cid>CT0000001960</cid><type>33</type><icon>9</icon><name>키패드</name><value>2</value><alive>1</alive><battery>100</battery><rssi>0</rssi><reg>0</reg></hubthing><hubthing><creationtime>2019.06.03 10:50:18+09:00</creationtime><lastmodifiedtime>2019.06.03 10:50:18+09:00</lastmodifiedtime><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><toid>0.18.6.1</toid><cid>CT0000001968</cid><type>18</type><icon>0</icon><name>동작감지기</name><value>1</value><alive>1</alive><battery>100</battery><temper>26</temper><humid>45</humid><rssi>93</rssi><reg>0</reg></hubthing><hubthing><creationtime>2019.06.03 10:52:17+09:00</creationtime><lastmodifiedtime>2019.06.03 10:52:17+09:00</lastmodifiedtime><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><toid>0.65.7.1</toid><cid>CT0000001969</cid><type>65</type><icon></icon><name>경광등</name><value>255</value><alive>1</alive><battery>100</battery><rssi>86</rssi><reg>0</reg></hubthing><hubthing><creationtime>2019.06.03 10:54:37+09:00</creationtime><lastmodifiedtime>2019.06.03 10:54:37+09:00</lastmodifiedtime><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><toid>0.19.8.1</toid><cid>CT0000001970</cid><type>19</type><icon></icon><name>연기감지기</name><value>0</value><alive>0</alive><battery>100</battery><rssi>87</rssi><reg>0</reg></hubthing><hubthing><creationtime>2019.06.03 10:56:17+09:00</creationtime><lastmodifiedtime>2019.06.03 10:56:17+09:00</lastmodifiedtime><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><toid>0.34.9.1</toid><cid>CT0000001972</cid><type>34</type><icon></icon><name>SOS버튼</name><value>255</value><alive>1</alive><battery>100</battery><rssi>88</rssi><reg>0</reg></hubthing><camerainfo><creationtime>2019.06.26 14:39:28</creationtime><lastmodifiedtime>2019.06.26 14:39:28</lastmodifiedtime><cameraid>CAM0000001172</cameraid><cseid>1.3.6.1.4.1.7345.6.1905900009</cseid><serial>1905900009</serial><name>RayCam-009</name><ukey>6cf2d5fcccf5a82aea7b24c9623a7b2c33a16098818a2d16073750dff0e97c84</ukey><password>00000000</password><stillshotnum>1</stillshotnum><pirwait>1</pirwait><pirsense>5</pirsense><streamingreqtime>1</streamingreqtime><version>1.00</version><connect>2</connect><rtspip>192.168.0.7</rtspip><stillshotyn>0</stillshotyn></camerainfo><secureinfo><creationtime>2019.01.07 10:00:09+09:00</creationtime><lastmodifiedtime>2019.01.11 10:20:49+09:00</lastmodifiedtime><seid>SQ0000000247</seid><name>외출경비</name><ukey>6cf2d5fcccf5a82aea7b24c9623a7b2c33a16098818a2d16073750dff0e97c84</ukey><hubid>HU0000011531</hubid><cseid>1.3.6.1.4.1.7345.2.000000206</cseid><enable>0</enable><alltime>1</alltime><starttime>0000</starttime><endtime>2359</endtime><icon>10</icon><rules>SR0000000511</rules><rules>SR0000000515</rules><rules>SR0000000567</rules><mode>0</mode><exitdelayyn>0</exitdelayyn><exitdelay>20</exitdelay><securerules/><entrancedelayyn>0</entrancedelayyn><entrancedelay>10</entrancedelay></secureinfo><securerule><creationtime>2019.01.07 10:14:09+09:00</creationtime><lastmodifiedtime>2019.01.07 10:14:09+09:00</lastmodifiedtime><ruleid>SR0000000511</ruleid><seid>SQ0000000247</seid><cid>CT0000000480</cid><cseid>1.3.6.1.4.1.7345.2.000000206</cseid><condition>0</condition><andor>1</andor><toid>0.33.1.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><securerule><creationtime>2019.01.07 10:15:20+09:00</creationtime><lastmodifiedtime>2019.01.11 10:09:53</lastmodifiedtime><ruleid>SR0000000515</ruleid><seid>SQ0000000247</seid><cid>CT0000000482</cid><cseid>1.3.6.1.4.1.7345.2.000000206</cseid><condition>0</condition><andor>1</andor><toid>0.17.3.1</toid><entrancedelayyn>0</entrancedelayyn></securerule><securerule><creationtime>2019.01.11 10:20:49+09:00</creationtime><lastmodifiedtime>2019.01.11 10:20:49+09:00</lastmodifiedtime><ruleid>SR0000000567</ruleid><seid>SQ0000000247</seid><cid>CT0000000509</cid><cseid>1.3.6.1.4.1.7345.2.000000206</cseid><condition>0</condition><andor>1</andor><toid>0.18.5.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><secureinfo><creationtime>2019.01.07 10:00:09+09:00</creationtime><lastmodifiedtime>2019.01.11 10:20:49+09:00</lastmodifiedtime><seid>SQ0000000248</seid><name>재실경비</name><ukey>6cf2d5fcccf5a82aea7b24c9623a7b2c33a16098818a2d16073750dff0e97c84</ukey><hubid>HU0000011531</hubid><cseid>1.3.6.1.4.1.7345.2.000000206</cseid><enable>0</enable><alltime>1</alltime><starttime>0000</starttime><endtime>2359</endtime><icon>11</icon><rules>SR0000000512</rules><rules>SR0000000514</rules><rules>SR0000000516</rules><rules>SR0000000568</rules><mode>1</mode><exitdelayyn>1</exitdelayyn><exitdelay>0</exitdelay><securerules/><entrancedelayyn>1</entrancedelayyn><entrancedelay>0</entrancedelay></secureinfo><securerule><creationtime>2019.01.07 10:14:09+09:00</creationtime><lastmodifiedtime>2019.01.07 10:16:09</lastmodifiedtime><ruleid>SR0000000512</ruleid><seid>SQ0000000248</seid><cid>CT0000000480</cid><cseid>1.3.6.1.4.1.7345.2.000000206</cseid><condition>0</condition><andor>1</andor><toid>0.33.1.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><securerule><creationtime>2019.01.07 10:14:34+09:00</creationtime><lastmodifiedtime>2019.01.07 10:14:34+09:00</lastmodifiedtime><ruleid>SR0000000514</ruleid><seid>SQ0000000248</seid><cid>CT0000000481</cid><cseid>1.3.6.1.4.1.7345.2.000000206</cseid><condition>1</condition><andor>1</andor><toid>0.18.2.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><securerule><creationtime>2019.01.07 10:15:20+09:00</creationtime><lastmodifiedtime>2019.01.11 10:10:42</lastmodifiedtime><ruleid>SR0000000516</ruleid><seid>SQ0000000248</seid><cid>CT0000000482</cid><cseid>1.3.6.1.4.1.7345.2.000000206</cseid><condition>0</condition><andor>1</andor><toid>0.17.3.1</toid></securerule><securerule><creationtime>2019.01.11 10:20:49+09:00</creationtime><lastmodifiedtime>2019.01.11 10:20:49+09:00</lastmodifiedtime><ruleid>SR0000000568</ruleid><seid>SQ0000000248</seid><cid>CT0000000509</cid><cseid>1.3.6.1.4.1.7345.2.000000206</cseid><condition>1</condition><andor>1</andor><toid>0.18.5.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><secureinfo><creationtime>2019.06.02 16:00:03+09:00</creationtime><lastmodifiedtime>2019.06.11 12:00:38+09:00</lastmodifiedtime><seid>SQ0000001733</seid><name>Away</name><ukey>6cf2d5fcccf5a82aea7b24c9623a7b2c33a16098818a2d16073750dff0e97c84</ukey><hubid>HU0000012094</hubid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><enable>0</enable><alltime>1</alltime><starttime>0000</starttime><endtime>2359</endtime><icon>10</icon><rules>SR0000003769</rules><rules>SR0000003771</rules><rules>SR0000003787</rules><rules>SR0000003789</rules><rules>SR0000003791</rules><rules>SR0000003795</rules><mode>0</mode><exitdelayyn>1</exitdelayyn><exitdelay>0</exitdelay><securerules/><entrancedelayyn>1</entrancedelayyn><entrancedelay>0</entrancedelay></secureinfo><securerule><creationtime>2019.06.02 16:00:58+09:00</creationtime><lastmodifiedtime>2019.06.04 15:20:20</lastmodifiedtime><ruleid>SR0000003769</ruleid><seid>SQ0000001733</seid><cid>CT0000001959</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>0</condition><andor>1</andor><toid>0.17.4.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><securerule><creationtime>2019.06.02 19:51:30+09:00</creationtime><lastmodifiedtime>2019.06.02 19:51:30+09:00</lastmodifiedtime><ruleid>SR0000003771</ruleid><seid>SQ0000001733</seid><cid>CT0000001960</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>0</condition><andor>1</andor><toid>0.33.5.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><securerule><creationtime>2019.06.03 10:50:18+09:00</creationtime><lastmodifiedtime>2019.06.10 11:40:16</lastmodifiedtime><ruleid>SR0000003787</ruleid><seid>SQ0000001733</seid><cid>CT0000001968</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>1</condition><andor>1</andor><toid>0.18.6.1</toid></securerule><securerule><creationtime>2019.06.03 10:52:17+09:00</creationtime><lastmodifiedtime>2019.06.03 10:52:17+09:00</lastmodifiedtime><ruleid>SR0000003789</ruleid><seid>SQ0000001733</seid><cid>CT0000001969</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>0</condition><andor>1</andor><toid>0.65.7.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><securerule><creationtime>2019.06.03 10:54:37+09:00</creationtime><lastmodifiedtime>2019.06.03 10:54:37+09:00</lastmodifiedtime><ruleid>SR0000003791</ruleid><seid>SQ0000001733</seid><cid>CT0000001970</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>0</condition><andor>1</andor><toid>0.19.8.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><securerule><creationtime>2019.06.03 10:56:17+09:00</creationtime><lastmodifiedtime>2019.06.03 10:56:17+09:00</lastmodifiedtime><ruleid>SR0000003795</ruleid><seid>SQ0000001733</seid><cid>CT0000001972</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>0</condition><andor>1</andor><toid>0.34.9.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><secureinfo><creationtime>2019.06.02 16:00:03+09:00</creationtime><lastmodifiedtime>2019.06.10 11:39:35+09:00</lastmodifiedtime><seid>SQ0000001734</seid><name>Home</name><ukey>6cf2d5fcccf5a82aea7b24c9623a7b2c33a16098818a2d16073750dff0e97c84</ukey><hubid>HU0000012094</hubid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><enable>0</enable><alltime>1</alltime><starttime>0000</starttime><endtime>2359</endtime><icon>11</icon><rules>SR0000003770</rules><rules>SR0000003772</rules><rules>SR0000003788</rules><rules>SR0000003790</rules><rules>SR0000003792</rules><rules>SR0000003796</rules><mode>1</mode><exitdelayyn>1</exitdelayyn><exitdelay>0</exitdelay><securerules/><entrancedelayyn>1</entrancedelayyn><entrancedelay>0</entrancedelay></secureinfo><securerule><creationtime>2019.06.02 16:00:58+09:00</creationtime><lastmodifiedtime>2019.06.02 16:00:58+09:00</lastmodifiedtime><ruleid>SR0000003770</ruleid><seid>SQ0000001734</seid><cid>CT0000001959</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>1</condition><andor>1</andor><toid>0.17.4.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><securerule><creationtime>2019.06.02 19:51:30+09:00</creationtime><lastmodifiedtime>2019.06.02 19:51:30+09:00</lastmodifiedtime><ruleid>SR0000003772</ruleid><seid>SQ0000001734</seid><cid>CT0000001960</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>1</condition><andor>1</andor><toid>0.33.5.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><securerule><creationtime>2019.06.03 10:50:18+09:00</creationtime><lastmodifiedtime>2019.06.10 11:39:35</lastmodifiedtime><ruleid>SR0000003788</ruleid><seid>SQ0000001734</seid><cid>CT0000001968</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>0</condition><andor>1</andor><toid>0.18.6.1</toid></securerule><securerule><creationtime>2019.06.03 10:52:17+09:00</creationtime><lastmodifiedtime>2019.06.03 10:52:17+09:00</lastmodifiedtime><ruleid>SR0000003790</ruleid><seid>SQ0000001734</seid><cid>CT0000001969</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>1</condition><andor>1</andor><toid>0.65.7.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><securerule><creationtime>2019.06.03 10:54:37+09:00</creationtime><lastmodifiedtime>2019.06.03 10:54:37+09:00</lastmodifiedtime><ruleid>SR0000003792</ruleid><seid>SQ0000001734</seid><cid>CT0000001970</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>1</condition><andor>1</andor><toid>0.19.8.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><securerule><creationtime>2019.06.03 10:56:17+09:00</creationtime><lastmodifiedtime>2019.06.03 10:56:17+09:00</lastmodifiedtime><ruleid>SR0000003796</ruleid><seid>SQ0000001734</seid><cid>CT0000001972</cid><cseid>1.3.6.1.4.1.7345.2.1905000013</cseid><condition>1</condition><andor>1</andor><toid>0.34.9.1</toid><entrancedelayyn>1</entrancedelayyn></securerule><buddy><userid>UI0000000194</userid><email>Ray_shared1@hstelnet.com</email><ukey>fe4099b15edfa2958bb2118d39f40be1153290eea137959e70a8f609eff18813</ukey><idphoto>null</idphoto><username>Ray_shared1</username><nickname>null</nickname><hubs></hubs></buddy><buddy><userid>UI0000000207</userid><email>hs.bellakang@gmail.com</email><ukey>4070585e214a45b4698e5a4c9c1e4b479e4b101fccdc56720d3908acc50de253</ukey><idphoto>null</idphoto><username>주미</username><nickname>null</nickname><hubs></hubs></buddy><buddy><userid>UI0000000061</userid><email>dlwovlf12@hanmail.net</email><ukey>21e493a459e7807472aa69de97041c2508dbeb4a0bc82fe4d6f94ad3902dd533</ukey><idphoto>null</idphoto><username>이재필</username><nickname>null</nickname><hubs><hubid>HU0000012094</hubid></hubs></buddy><hubversion><lastmodifiedtime>2019.05.14 09:00:00</lastmodifiedtime><version>2.0.1</version><vmd>mint_sni.bin</vmd><vkey>123456</vkey><vid>VK0000000034</vid></hubversion><hubversion2><lastmodifiedtime>2019.06.24 09:00:00</lastmodifiedtime><version>2.0.0</version><vmd>Rayhome2_v2.0.0.bin</vmd><vkey>rayhome2hub</vkey><vid>VK0000000034</vid></hubversion2></smarthome>
*/

//JSON Object
import android.util.Log;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.XML;

/*
 org.json.XML 셋팅
    1. project folder > app > libs > java-json.jar 파일 복사
    2. build.gradle에 implementation files('libs/java-json.jar') 추가
*/



public class XmlJson {
    public static String getJSONToXML(Object obj, String rootElement) {
        /*
         <rootElement>
            <objItem1>
            </objItem1>
            <objItem2>
            </objItem2>
            ...
         </rootElement>
         <rootElement>
            <objItem1>
            </objItem1>
            <objItem2>
            </objItem2>
            ...
         </rootElement>
        */
        try {
            return XML.toString(obj, rootElement);
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
    public static JSONObject getXMLToJSON(String xml) {
        xml.replaceAll("\n", "");
        JSONObject jsonObj = null;
        try {
            jsonObj = XML.toJSONObject(xml);
        } catch (JSONException e) {
            HSLog.e("JSON exception", e.getMessage());
            e.printStackTrace();
        }

        return jsonObj;
    }
    public static String getXMLToJSONString(String xml) {
        xml.replaceAll("\n", "");
        JSONObject jsonObj = null;
        try {
            jsonObj = XML.toJSONObject(xml);
        } catch (JSONException e) {
            HSLog.e("JSON exception", e.getMessage());
            e.printStackTrace();
        }

        return jsonObj.toString();
    }

    //설명 : XML String에서 field(Parameter)에 매칭되는 Item값을 가져온다. (같은 명칭이 여러개 존재할 경우 3번째 파라미터 사용.)
    public static String getItemOfXML(String xml, String field) {
        /*
         * 2019.06.28 - Leejaephil
         * 사용 방법
         *   ## String : "<shshistory><issuedate>{issuedate}</issuedate><hid>{hid}</hid><type>{type}</type><subtype>{subtype}</subtype><ukey>{ukey}</ukey><id>{id}</id><subid>{subid}</subid><name>{name}</name><content>{content}</content><description>{description}</description></shshistory>";
         *
         *  # getItemOfXml(temp, "hid") => {hid}
         *  # getItemOfXml(temp, "description") => {description}
         *  # getItemOfXml(getItemOfXml(temp, "shshistory"), "hid") => {hid}   (여러 JSON중 같은 필드 명이 존재할 경우)
         *
         */
        xml.replaceAll("\n", "");
        int startIndex = xml.indexOf("<" + field);
        int endIndex = xml.indexOf("</" + field);

        if(startIndex == -1 || endIndex == -1)
            return "";

        startIndex = xml.indexOf(">", startIndex);

        return xml.substring(startIndex + 1, endIndex);
    }
    public static String getItemOfXML(String xml, String field, int index) {
        //중복 필드가 여러개 존재할 경우 index번째 것을 반환하며, 존재하지 않을 경우 "" 반환.
        //index는 0이 첫번째.
        xml.replaceAll("\n", "");
        if (index < 0)
            return "";

        int startIndex, endIndex;
        startIndex = endIndex = 0;

        for (int i=0;i<index + 1;i++) {
            startIndex = xml.indexOf("<" + field, endIndex);
            endIndex = xml.indexOf("</" + field, startIndex);
        }

        if(startIndex == -1 || endIndex == -1)
            return "";

        startIndex = xml.indexOf(">", startIndex);

        return xml.substring(startIndex + 1, endIndex);
    }

    //설명 : XML String에서 field의 개수를 가져온다.
    public static int getItemCountOfXML(String xml, String field) {
        xml.replaceAll("\n", "");
        int cnt = 0, div = 0;

        while ((div = xml.indexOf("<" + field, div)) != -1) {
            cnt++;
            div++;
        }

        return cnt;
    }
}
