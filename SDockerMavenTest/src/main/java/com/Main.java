package com;

import chat.logs.LoggerEx;
import com.alibaba.fastjson.JSONObject;
import com.docker.rpc.remote.stub.ServiceStubManager;

import java.io.IOException;

/**
 * Created by Aplomb on 2017/3/22.
 */
public class Main {
    public static void main(String... args) throws IOException {
        LoggerEx.setLogListener(new LoggerEx.LogListener() {
            @Override
            public void debug(String s) {
                System.out.println(s);
            }

            @Override
            public void info(String s) {
                System.out.println(s);
            }

            @Override
            public void warn(String s) {
                System.out.println(s);
            }

            @Override
            public void error(String s) {
                System.out.println(s);
            }

            @Override
            public void fatal(String s) {
                System.out.println(s);
            }
        });
        ServiceStubManager serviceStubManager = new ServiceStubManager();
//        serviceStubManager.setHost("192.168.31.189:10055");
        serviceStubManager.setHost("192.168.3.92:8088");
//        serviceStubManager.setUsePublicDomain(false);
        serviceStubManager.init();

// 5a620abcb5830d388aa31c72
        TCClassRoomService tcClassRoomService = serviceStubManager.getService("tcclassroom", TCClassRoomService.class);
//        tcClassRoomService.deleteTCClassRoom("5a619c3bb5830d0c60776591");
        TCClassRoom tcClassRoom = tcClassRoomService.addClass(new TCClassRoom());
        tcClassRoom.setEndTime(10000L);
        tcClassRoomService.updateTCClassRoom(tcClassRoom.getId(),tcClassRoom);
//        TCClassRoom tcClassRoom = tcClassRoomService.addClass(new TCClassRoom());
//        TCClassRoom tcClassRoom = tcClassRoomService.getClassRoom("5a619c3bb5830d0c60776591");

//        UserService userService = serviceStubManager.getService("pkuser", UserService.class);
//        WalletService walletServic
// e = serviceStubManager.getService("pkwallet", WalletService.class);
//        RoomService roomService = serviceStubManager.getService("pkroom", RoomService.class);
//
//        ServersService serversService = serviceStubManager.getService("discovery", ServersService.class);
//        Object obj = serversService.getServerConfig("discovery");
////        DockerStatus status = new DockerStatus();
////        status.setIp("192.1.1.1.1");
////        status.setPublicDomain("asfasd");
//        AtomicInteger counter = new AtomicInteger(0);
//        for(int i = 0; i < 1; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    int count = counter.incrementAndGet();
//                    for(int j = 0; j < 1; j++) {
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        try {
//                            Map<String, UserView> map = userService.getUsersByAccounts(new String[]{"u2", "u1"});
//                            UserView userView = userService.getUserByAccount("u2");
//                            System.out.println("userView " + userView);
////                            Topup topup = new Topup();
////                            topup.setInc(10L);
////                            topup.setIp("192.168.11.11");
////                            topup.setUserAgent("android mix");
////                            topup.setUserId("admin");
////                            topup.setUserName("Admin");
////                            Long balance = walletService.getPlayerWallet(userView.getId());
//////                            Long balance = walletService.topupPlayerBalance(userView.getId(), topup);
////                            System.out.println("walletView " + balance);
////
////                            Object room = roomService.getRunningGameRoomByNum("019960");
////                            System.out.println("room " + room);
//                        } catch(Throwable t) {
//                            t.printStackTrace();
//                            System.out.println("failed " + t.getMessage());
//                        }
//                    }
//                }
//            }).start();
//        }
    }
}
