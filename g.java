import android.content.Context;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;

public abstract class g
{
    public static final HashSet a;
    
    static {
        a = new HashSet((Collection)Arrays.asList((Object[])new String[] { "com.google.android.apps.chrome", "com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.chrome.canary", "org.chromium.chrome", "org.chromium.chrome.tests", "org.chromium.arc.intent_helper", "org.chromium.arc.webapk" }));
    }
    
    public static f a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    D.d:(Landroid/content/Context;)Landroid/os/Bundle;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       14
        //     9: aconst_null    
        //    10: astore_3       
        //    11: goto            21
        //    14: aload_3        
        //    15: ldc             "org.chromium.webapk.shell_apk.runtimeHost"
        //    17: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    20: astore_3       
        //    21: aload_3        
        //    22: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    25: istore_1       
        //    26: iconst_0       
        //    27: istore_2       
        //    28: iload_1        
        //    29: ifne            72
        //    32: aload_0        
        //    33: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    36: astore          4
        //    38: aload_3        
        //    39: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    42: ifeq            50
        //    45: iconst_0       
        //    46: istore_1       
        //    47: goto            65
        //    50: aload           4
        //    52: aload_3        
        //    53: iconst_0       
        //    54: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //    57: astore          4
        //    59: aload           4
        //    61: getfield        android/content/pm/ApplicationInfo.enabled:Z
        //    64: istore_1       
        //    65: iload_1        
        //    66: ifeq            72
        //    69: goto            74
        //    72: aconst_null    
        //    73: astore_3       
        //    74: aload_3        
        //    75: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    78: ifne            101
        //    81: new             Ljava/lang/Object;
        //    84: dup            
        //    85: invokespecial   java/lang/Object.<init>:()V
        //    88: astore_0       
        //    89: aload_0        
        //    90: aload_3        
        //    91: putfield        f.a:Ljava/lang/String;
        //    94: aload_0        
        //    95: aconst_null    
        //    96: putfield        f.b:Landroid/content/ComponentName;
        //    99: aload_0        
        //   100: areturn        
        //   101: aload_0        
        //   102: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   105: astore_3       
        //   106: aload_3        
        //   107: new             Landroid/content/Intent;
        //   110: dup            
        //   111: invokespecial   android/content/Intent.<init>:()V
        //   114: ldc             "android.intent.action.VIEW"
        //   116: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   119: ldc             "android.intent.category.BROWSABLE"
        //   121: invokevirtual   android/content/Intent.addCategory:(Ljava/lang/String;)Landroid/content/Intent;
        //   124: ldc             "http://"
        //   126: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   129: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //   132: ldc             65536
        //   134: invokevirtual   android/content/pm/PackageManager.resolveActivity:(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
        //   137: astore_0       
        //   138: aload_0        
        //   139: ifnull          173
        //   142: aload_0        
        //   143: getfield        android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
        //   146: ifnull          173
        //   149: aload_0        
        //   150: getfield        android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
        //   153: astore_0       
        //   154: new             Landroid/content/ComponentName;
        //   157: dup            
        //   158: aload_0        
        //   159: getfield        android/content/pm/ActivityInfo.packageName:Ljava/lang/String;
        //   162: aload_0        
        //   163: getfield        android/content/pm/ActivityInfo.name:Ljava/lang/String;
        //   166: invokespecial   android/content/ComponentName.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   169: astore_0       
        //   170: goto            175
        //   173: aconst_null    
        //   174: astore_0       
        //   175: aload_0        
        //   176: ifnull          248
        //   179: aload_0        
        //   180: invokevirtual   android/content/ComponentName.getPackageName:()Ljava/lang/String;
        //   183: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   186: ifne            248
        //   189: aload_0        
        //   190: invokevirtual   android/content/ComponentName.getPackageName:()Ljava/lang/String;
        //   193: astore          4
        //   195: aload           4
        //   197: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   200: ifeq            208
        //   203: iload_2        
        //   204: istore_1       
        //   205: goto            221
        //   208: aload_3        
        //   209: aload           4
        //   211: iconst_0       
        //   212: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   215: astore_3       
        //   216: aload_3        
        //   217: getfield        android/content/pm/ApplicationInfo.enabled:Z
        //   220: istore_1       
        //   221: iload_1        
        //   222: ifeq            248
        //   225: new             Ljava/lang/Object;
        //   228: dup            
        //   229: invokespecial   java/lang/Object.<init>:()V
        //   232: astore_3       
        //   233: aload_3        
        //   234: aload_0        
        //   235: invokevirtual   android/content/ComponentName.getPackageName:()Ljava/lang/String;
        //   238: putfield        f.a:Ljava/lang/String;
        //   241: aload_3        
        //   242: aload_0        
        //   243: putfield        f.b:Landroid/content/ComponentName;
        //   246: aload_3        
        //   247: areturn        
        //   248: aconst_null    
        //   249: areturn        
        //   250: astore          4
        //   252: goto            45
        //   255: astore_3       
        //   256: iload_2        
        //   257: istore_1       
        //   258: goto            221
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  50     59     250    255    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  208    216    255    261    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0208:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
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
    
    public static boolean b(final e e) {
        if (e.a) {
            final f b = e.b;
            if (!b.a.equals((Object)"org.chromium.arc.intent_helper") && !b.a.equals((Object)"org.chromium.arc.webapk")) {
                return true;
            }
        }
        return false;
    }
}
