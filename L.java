package com.csonezp.util;

import android.util.Log;
//这里是gradle自动生成的
import com.csonezp.BuildConfig;

/**
 * Created by csonezp on 15-10-29.
 * Log类，L.d(msg)即可使用，默认类名为tag，并可点击跳转到输出log的位置
 * 请在全局使用此类输出日志
 */
public class L {
    //debug自动打开日志，release版自动关闭日志
    //需要在buildTypes中加入debug： buildConfigField "boolean", "LOG_DEBUG", "true"
    //release： buildConfigField "boolean", "LOG_DEBUG", "false"
    private static boolean SHOW_LOG = BuildConfig.LOG_DEBUG;

    private L() {
    }

    public static String getClassName() {
        String result;
        StackTraceElement thisMethodStack = (new Exception()).getStackTrace()[2];
        result = thisMethodStack.getClassName();
        int lastIndex = result.lastIndexOf(".");
        result = result.substring(lastIndex + 1, result.length());
        result += "(" + thisMethodStack.getFileName();
        result += ":" + thisMethodStack.getLineNumber() + ")  ";
        return result;
    }

    public static void d(String msg) {
        if (SHOW_LOG) {
            Log.d(getClassName(), msg);
        }
    }

    public static void d(String msg, Throwable throwable) {
        if (SHOW_LOG) {
            Log.d(getClassName(), msg, throwable);
        }
    }

    public static void v(String msg) {
        if (SHOW_LOG) {
            Log.v(getClassName(), msg);
        }
    }

    public static void v(String msg, Throwable throwable) {
        if (SHOW_LOG) {
            Log.v(getClassName(), msg, throwable);
        }
    }

    public static void i(String msg) {
        if (SHOW_LOG) {
            Log.i(getClassName(), msg);
        }
    }

    public static void i(String msg, Throwable throwable) {
        if (SHOW_LOG) {
            Log.i(getClassName(), msg, throwable);
        }
    }

    public static void e(String msg) {
        if (SHOW_LOG) {
            Log.e(getClassName(), msg);
        }
    }

    public static void e(String msg, Throwable throwable) {
        if (SHOW_LOG) {
            Log.e(getClassName(), msg, throwable);
        }
    }

    public static void d(String tag, String msg) {
        if (SHOW_LOG) {
            Log.d(tag, msg);
        }
    }

    public static void d(String tag, String msg, Throwable throwable) {
        if (SHOW_LOG) {
            Log.d(tag, msg, throwable);
        }
    }

    public static void v(String tag, String msg) {
        if (SHOW_LOG) {
            Log.v(tag, msg);
        }
    }

    public static void v(String tag, String msg, Throwable throwable) {
        if (SHOW_LOG) {
            Log.v(tag, msg, throwable);
        }
    }

    public static void i(String tag, String msg) {
        if (SHOW_LOG) {
            Log.i(tag, msg);
        }
    }

    public static void i(String tag, String msg, Throwable throwable) {
        if (SHOW_LOG) {
            Log.i(tag, msg, throwable);
        }
    }

    public static void e(String tag, String msg) {
        if (SHOW_LOG) {
            Log.e(tag, msg);
        }
    }

    public static void e(String tag, String msg, Throwable throwable) {
        if (SHOW_LOG) {
            Log.e(tag, msg, throwable);
        }
    }


    public static void w(String msg) {
        if (SHOW_LOG) {
            Log.w(getClassName(), msg);
        }
    }

    public static void w(String tag, String msg) {
        if (SHOW_LOG) {
            Log.w(tag, msg);
        }
    }

    public static void w(String tag, String msg, Throwable throwable) {
        if (SHOW_LOG) {
            Log.w(tag, msg, throwable);
        }
    }

    public static void w(String msg, Throwable throwable) {
        if (SHOW_LOG) {
            Log.w(getClassName(), msg, throwable);
        }
    }

}
