package by.it.burov.jd01_14;

import java.io.File;

public class PathFinder {

    public static String getFilename(Class<?> aClass, String root, String filename) {
        filename =  System.getProperty("user.dir")+
                File.separator+ root+File.separator +
                aClass.getPackageName().replace(".",File.separator)
                + File.separator+filename;
        return filename;
    }
}
