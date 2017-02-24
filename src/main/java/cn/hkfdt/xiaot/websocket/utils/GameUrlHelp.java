package cn.hkfdt.xiaot.websocket.utils;

/**
 * Created by whyse
 * on 2017/2/23 18:51
 */
public class GameUrlHelp {
    /**
     * 监听比赛用户准备信息/gameId
     */
    final public static String topic_userReadyInfo = "/topic/game/readyInfo";
    /**
     * 请求，客户端准备好了，返回信息是否准备好
     */
    final public static String queue_userDoReady = "/queue/game/doReady";//客户端监听/user/queue/game/doReady
    /**
     * 通知订阅者比赛开始/gameId
     */
    final public static String topic_gameStart = "/topic/game/start";
    /**
     * 请求，比赛开始，成功就返回相关
     */
    final public static String queue_gameStart = "/queue/game/start";//客户端监听/user/queue/game/start
    /**
     * 通知裁判端所有客户端信息及排行/gameId
     */
    final public static String topic_gameAllInfo = "/topic/game/allInfo";
    /**
     * 请求，发送客户端信息给服务端
     */
    final public static String queue_gameclientInfo = "/queue/game/clientInfo";//客户端监听/user/queue/game/clientInfo

    //================================================
    public static String getReadyInfo(String gameId) {
        return topic_userReadyInfo+gameId;
    }
}