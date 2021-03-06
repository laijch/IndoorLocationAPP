package com.project.indoorlocalization.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ljm on 2017/6/27.
 */
public class Data {
    public static double x = 652;
    public static double y = 1712;
    public static String label1="";
    public static String label2="";
    public static String label3="";
    public static Map<String, String> shopNames = new HashMap<>();  //店铺名称
    public static boolean labelShowing = false;

    public static double mMaxX = 2960;


    public static String img_sensor1,img_sensor2,img_sensor3;     //每张图片的传感器信息
    public static float angle1, angle2;
    public static String[] img_path = new String[3];                //图片存储路径

    public static String planB = "未开启";

    public static List<Bitmap> imgs = new ArrayList<>();
    public static String picture_save_path = "/tempImages";


    public static void recycleBitmap(List<Bitmap> list) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) != null && ! list.get(i).isRecycled()) {
                list.get(i).recycle();
            }
        }
        list.clear();
    }

    public static String getPictureSavePath() {
        return Environment.getExternalStorageDirectory() + picture_save_path;
    }
}
