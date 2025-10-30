package org.chromium.webapk.shell_apk;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public class WebApkServiceFactory extends Service
{
    public final IBinder onBind(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    g.a:(Landroid/content/Context;)Lf;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnull          18
        //     9: aload_1        
        //    10: getfield        f.a:Ljava/lang/String;
        //    13: astore          7
        //    15: goto            21
        //    18: aconst_null    
        //    19: astore          7
        //    21: getstatic       g.a:Ljava/util/HashSet;
        //    24: aload           7
        //    26: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //    29: ifne            42
        //    32: ldc             "cr_WebApkServiceFactory"
        //    34: ldc             "Host browser does not support WebAPK notification delegation."
        //    36: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    39: pop            
        //    40: aconst_null    
        //    41: areturn        
        //    42: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //    45: invokestatic    android/os/Looper.myLooper:()Landroid/os/Looper;
        //    48: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    51: ifeq            823
        //    54: aload_0        
        //    55: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //    58: aload           7
        //    60: iconst_0       
        //    61: invokevirtual   android/content/Context.createPackageContext:(Ljava/lang/String;I)Landroid/content/Context;
        //    64: astore          8
        //    66: goto            77
        //    69: astore_1       
        //    70: aload_1        
        //    71: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //    74: aconst_null    
        //    75: astore          8
        //    77: iconst_m1      
        //    78: istore          4
        //    80: aload           8
        //    82: ifnonnull       98
        //    85: ldc             "cr_HostBrowserClassLoader"
        //    87: ldc             "Failed to get remote context."
        //    89: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    92: pop            
        //    93: aconst_null    
        //    94: astore_1       
        //    95: goto            666
        //    98: getstatic       c.a:Ldalvik/system/BaseDexClassLoader;
        //   101: ifnull          132
        //   104: aload_0        
        //   105: ldc             "org.chromium.webapk.shell_apk"
        //   107: iconst_0       
        //   108: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   111: ldc             "org.chromium.webapk.shell_apk.version_code"
        //   113: iconst_m1      
        //   114: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //   119: istore_2       
        //   120: aload           8
        //   122: invokestatic    c.a:(Landroid/content/Context;)I
        //   125: iload_2        
        //   126: if_icmpne       132
        //   129: goto            662
        //   132: aload_0        
        //   133: ldc             "org.chromium.webapk.shell_apk"
        //   135: iconst_0       
        //   136: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   139: astore          9
        //   141: aload           9
        //   143: ldc             "org.chromium.webapk.shell_apk.dex_version"
        //   145: iconst_m1      
        //   146: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //   151: istore          5
        //   153: aload           8
        //   155: invokestatic    c.a:(Landroid/content/Context;)I
        //   158: istore          6
        //   160: aload           9
        //   162: ldc             "org.chromium.webapk.shell_apk.version_code"
        //   164: iconst_m1      
        //   165: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //   170: iload           6
        //   172: if_icmpne       180
        //   175: iconst_m1      
        //   176: istore_3       
        //   177: goto            305
        //   180: new             Ljava/util/Scanner;
        //   183: astore_1       
        //   184: aload_1        
        //   185: aload           8
        //   187: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //   190: ldc             "webapk_dex_version.txt"
        //   192: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;)Ljava/io/InputStream;
        //   195: invokespecial   java/util/Scanner.<init>:(Ljava/io/InputStream;)V
        //   198: aload_1        
        //   199: invokevirtual   java/util/Scanner.nextInt:()I
        //   202: istore_2       
        //   203: aload_1        
        //   204: invokevirtual   java/util/Scanner.close:()V
        //   207: aload_1        
        //   208: invokevirtual   java/util/Scanner.close:()V
        //   211: iload_2        
        //   212: istore_3       
        //   213: goto            270
        //   216: astore          8
        //   218: aload_1        
        //   219: astore          7
        //   221: aload           8
        //   223: astore_1       
        //   224: goto            249
        //   227: astore          10
        //   229: iconst_m1      
        //   230: istore_2       
        //   231: goto            261
        //   234: astore_1       
        //   235: aconst_null    
        //   236: astore          7
        //   238: goto            249
        //   241: astore_1       
        //   242: iconst_m1      
        //   243: istore_2       
        //   244: aconst_null    
        //   245: astore_1       
        //   246: goto            261
        //   249: aload           7
        //   251: ifnull          259
        //   254: aload           7
        //   256: invokevirtual   java/util/Scanner.close:()V
        //   259: aload_1        
        //   260: athrow         
        //   261: iload_2        
        //   262: istore_3       
        //   263: aload_1        
        //   264: ifnull          270
        //   267: goto            207
        //   270: aload           9
        //   272: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   277: astore_1       
        //   278: aload_1        
        //   279: ldc             "org.chromium.webapk.shell_apk.version_code"
        //   281: iload           6
        //   283: invokeinterface android/content/SharedPreferences$Editor.putInt:(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
        //   288: pop            
        //   289: aload_1        
        //   290: ldc             "org.chromium.webapk.shell_apk.dex_version"
        //   292: iload_3        
        //   293: invokeinterface android/content/SharedPreferences$Editor.putInt:(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
        //   298: pop            
        //   299: aload_1        
        //   300: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //   305: iload_3        
        //   306: istore_2       
        //   307: iload_3        
        //   308: iconst_m1      
        //   309: if_icmpne       315
        //   312: iload           5
        //   314: istore_2       
        //   315: aload_0        
        //   316: ldc             "dex"
        //   318: iconst_0       
        //   319: invokevirtual   android/content/Context.getDir:(Ljava/lang/String;I)Ljava/io/File;
        //   322: astore          10
        //   324: iload_2        
        //   325: iload           5
        //   327: if_icmpeq       343
        //   330: ldc             "cr_HostBrowserClassLoader"
        //   332: ldc             "Delete cached dex files."
        //   334: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   337: pop            
        //   338: aload           10
        //   340: invokestatic    a.a:(Ljava/io/File;)V
        //   343: new             Ljava/lang/StringBuilder;
        //   346: dup            
        //   347: ldc             "webapk"
        //   349: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   352: astore_1       
        //   353: aload_1        
        //   354: iload_2        
        //   355: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   358: pop            
        //   359: aload_1        
        //   360: ldc             ".dex"
        //   362: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   365: pop            
        //   366: aload_1        
        //   367: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   370: astore_1       
        //   371: new             Ljava/io/File;
        //   374: dup            
        //   375: aload           10
        //   377: aload_1        
        //   378: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   381: astore          9
        //   383: aload           9
        //   385: invokevirtual   java/io/File.exists:()Z
        //   388: ifeq            401
        //   391: aload           9
        //   393: invokevirtual   java/io/File.length:()J
        //   396: lconst_0       
        //   397: lcmp           
        //   398: ifne            488
        //   401: aload           10
        //   403: invokevirtual   java/io/File.exists:()Z
        //   406: ifne            422
        //   409: aload           10
        //   411: invokevirtual   java/io/File.mkdirs:()Z
        //   414: ifne            422
        //   417: aconst_null    
        //   418: astore_1       
        //   419: goto            658
        //   422: aload           8
        //   424: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //   427: aload_1        
        //   428: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;)Ljava/io/InputStream;
        //   431: astore_1       
        //   432: new             Ljava/io/FileOutputStream;
        //   435: astore          8
        //   437: aload           8
        //   439: aload           9
        //   441: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   444: sipush          16384
        //   447: newarray        B
        //   449: astore          11
        //   451: aload_1        
        //   452: aload           11
        //   454: iconst_0       
        //   455: sipush          16384
        //   458: invokevirtual   java/io/InputStream.read:([BII)I
        //   461: istore_2       
        //   462: iload_2        
        //   463: iconst_m1      
        //   464: if_icmpeq       479
        //   467: aload           8
        //   469: aload           11
        //   471: iconst_0       
        //   472: iload_2        
        //   473: invokevirtual   java/io/OutputStream.write:([BII)V
        //   476: goto            451
        //   479: aload_1        
        //   480: invokevirtual   java/io/InputStream.close:()V
        //   483: aload           8
        //   485: invokevirtual   java/io/OutputStream.close:()V
        //   488: new             Ljava/io/File;
        //   491: dup            
        //   492: aload           10
        //   494: ldc             "optimized"
        //   496: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   499: astore          8
        //   501: aload           8
        //   503: invokevirtual   java/io/File.exists:()Z
        //   506: ifne            520
        //   509: aload           8
        //   511: invokevirtual   java/io/File.mkdirs:()Z
        //   514: ifne            520
        //   517: goto            417
        //   520: new             Ldalvik/system/BaseDexClassLoader;
        //   523: astore_1       
        //   524: aload_1        
        //   525: aload           9
        //   527: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   530: aload           8
        //   532: aconst_null    
        //   533: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   536: invokespecial   dalvik/system/BaseDexClassLoader.<init>:(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/ClassLoader;)V
        //   539: aload_1        
        //   540: ldc             "org.chromium.webapk.lib.runtime_library.WebApkServiceImpl"
        //   542: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //   545: pop            
        //   546: goto            658
        //   549: astore_1       
        //   550: aload           8
        //   552: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   555: astore          8
        //   557: aload           9
        //   559: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   562: astore          9
        //   564: new             Ljava/lang/StringBuilder;
        //   567: dup            
        //   568: ldc             "Could not load dex from "
        //   570: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   573: astore          10
        //   575: aload           10
        //   577: aload           9
        //   579: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   582: pop            
        //   583: aload           10
        //   585: ldc             " with optimized directory "
        //   587: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   590: pop            
        //   591: aload           10
        //   593: aload           8
        //   595: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   598: pop            
        //   599: ldc             "cr.DexLoader"
        //   601: aload           10
        //   603: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   606: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   609: pop            
        //   610: aload_1        
        //   611: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //   614: goto            417
        //   617: aconst_null    
        //   618: astore          8
        //   620: goto            629
        //   623: astore_1       
        //   624: aconst_null    
        //   625: astore_1       
        //   626: goto            617
        //   629: aload_1        
        //   630: ifnull          637
        //   633: aload_1        
        //   634: invokevirtual   java/io/InputStream.close:()V
        //   637: aload           8
        //   639: ifnull          647
        //   642: aload           8
        //   644: invokevirtual   java/io/OutputStream.close:()V
        //   647: ldc             "cr.DexLoader"
        //   649: ldc             "Could not extract dex from assets"
        //   651: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   654: pop            
        //   655: goto            417
        //   658: aload_1        
        //   659: putstatic       c.a:Ldalvik/system/BaseDexClassLoader;
        //   662: getstatic       c.a:Ldalvik/system/BaseDexClassLoader;
        //   665: astore_1       
        //   666: aload_1        
        //   667: ifnonnull       680
        //   670: ldc             "cr_WebApkServiceFactory"
        //   672: ldc             "Unable to create ClassLoader."
        //   674: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   677: pop            
        //   678: aconst_null    
        //   679: areturn        
        //   680: aload_1        
        //   681: ldc             "org.chromium.webapk.lib.runtime_library.WebApkServiceImpl"
        //   683: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //   686: iconst_2       
        //   687: anewarray       Ljava/lang/Class;
        //   690: dup            
        //   691: iconst_0       
        //   692: ldc             Landroid/content/Context;.class
        //   694: aastore        
        //   695: dup            
        //   696: iconst_1       
        //   697: ldc             Landroid/os/Bundle;.class
        //   699: aastore        
        //   700: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   703: astore_1       
        //   704: aload           7
        //   706: ifnonnull       715
        //   709: iload           4
        //   711: istore_2       
        //   712: goto            744
        //   715: aload_0        
        //   716: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   719: aload           7
        //   721: sipush          128
        //   724: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   727: getfield        android/content/pm/ApplicationInfo.uid:I
        //   730: istore_2       
        //   731: goto            744
        //   734: astore          7
        //   736: aload           7
        //   738: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //   741: iload           4
        //   743: istore_2       
        //   744: new             Landroid/os/Bundle;
        //   747: astore          7
        //   749: aload           7
        //   751: invokespecial   android/os/Bundle.<init>:()V
        //   754: aload           7
        //   756: ldc_w           "small_icon_id"
        //   759: ldc_w           2131034114
        //   762: invokevirtual   android/os/BaseBundle.putInt:(Ljava/lang/String;I)V
        //   765: aload           7
        //   767: ldc_w           "host_browser_uid"
        //   770: iload_2        
        //   771: invokevirtual   android/os/BaseBundle.putInt:(Ljava/lang/String;I)V
        //   774: new             LA;
        //   777: dup            
        //   778: aload_0        
        //   779: aload_1        
        //   780: iconst_2       
        //   781: anewarray       Ljava/lang/Object;
        //   784: dup            
        //   785: iconst_0       
        //   786: aload_0        
        //   787: aastore        
        //   788: dup            
        //   789: iconst_1       
        //   790: aload           7
        //   792: aastore        
        //   793: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   796: checkcast       Landroid/os/IBinder;
        //   799: iload_2        
        //   800: invokespecial   A.<init>:(Lorg/chromium/webapk/shell_apk/WebApkServiceFactory;Landroid/os/IBinder;I)V
        //   803: astore_1       
        //   804: aload_1        
        //   805: areturn        
        //   806: astore_1       
        //   807: ldc             "cr_WebApkServiceFactory"
        //   809: ldc_w           "Unable to create WebApkServiceImpl."
        //   812: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   815: pop            
        //   816: aload_1        
        //   817: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //   820: goto            678
        //   823: new             Ljava/lang/AssertionError;
        //   826: dup            
        //   827: invokespecial   java/lang/AssertionError.<init>:()V
        //   830: athrow         
        //   831: astore          10
        //   833: goto            261
        //   836: astore_1       
        //   837: iload_2        
        //   838: istore_3       
        //   839: goto            270
        //   842: astore          7
        //   844: goto            259
        //   847: astore          8
        //   849: goto            617
        //   852: astore          9
        //   854: goto            629
        //   857: astore_1       
        //   858: goto            637
        //   861: astore_1       
        //   862: goto            647
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  54     66     69     77     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  180    198    241    249    Ljava/lang/Exception;
        //  180    198    234    241    Any
        //  198    203    227    234    Ljava/lang/Exception;
        //  198    203    216    227    Any
        //  203    207    831    836    Ljava/lang/Exception;
        //  203    207    216    227    Any
        //  207    211    836    842    Ljava/lang/Exception;
        //  254    259    842    847    Ljava/lang/Exception;
        //  422    432    623    629    Ljava/io/IOException;
        //  432    444    847    852    Ljava/io/IOException;
        //  444    451    852    857    Ljava/io/IOException;
        //  451    462    852    857    Ljava/io/IOException;
        //  467    476    852    857    Ljava/io/IOException;
        //  479    488    852    857    Ljava/io/IOException;
        //  520    546    549    617    Ljava/lang/Exception;
        //  633    637    857    861    Ljava/io/IOException;
        //  642    647    861    865    Ljava/io/IOException;
        //  680    704    806    823    Ljava/lang/Exception;
        //  715    731    734    744    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  715    731    806    823    Ljava/lang/Exception;
        //  736    741    806    823    Ljava/lang/Exception;
        //  744    804    806    823    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 426, Size: 426
        //     at java.util.ArrayList.get(ArrayList.java:437)
        //     at w5.a.o(SourceFile:31)
        //     at w5.a.j(SourceFile:218)
        //     at a6.j.j(SourceFile:23)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        //     at java.lang.Thread.run(Thread.java:923)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
