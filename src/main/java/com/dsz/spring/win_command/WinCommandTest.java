package com.dsz.spring.win_command;

import java.awt.*;
import java.io.*;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/9/15 16:56
 * @Description:
 */
public class WinCommandTest {
//    public static void main(String[] args) throws InterruptedException, IOException {
//        Runtime runtime = Runtime.getRuntime();
//        //Process ipconfig = runtime.exec("docker exec -it nvx_era /bin/bash -c /root/ra/run.sh");
//        Process ipconfig = runtime.exec("docker exec -it nvx_era /bin/bash -c ls");
//        ipconfig.waitFor();
//        InputStream inputStream = ipconfig.getInputStream();
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = inputStream.read(bytes)) != -1){
//            System.out.println(new String(bytes, 0, len, "GBK"));
//        }
//    }
    public static void main(String[] args) throws IOException {
        File batFile  = new File("C:/Users/dev/Desktop/test.bat");
        boolean batFileExist = batFile.exists();
        System.out.println("batFileExist:" + batFileExist);
        if (batFileExist) {
            callCmd(batFile.getPath());
        }
    }

    private static void  callCmd(String locationCmd){
        StringBuilder sb = new StringBuilder();
        try {
            Process child = Runtime.getRuntime().exec(locationCmd);
            InputStream in = child.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(in));
            String line;
            while((line=bufferedReader.readLine())!=null)
            {
                sb.append(line + "\n");
            }
            in.close();
            try {
                child.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("sb:" + sb.toString());
            System.out.println("callCmd execute finished");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
