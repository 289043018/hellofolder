package com.hand.hellofolder;

import java.io.File;

public class App 
{
    public static void main( String[] args )
    {
//        File folder = new File("my new file/one/two/three/main");
//        if(folder.mkdirs()){
//        	System.out.println("文件夹创建成功");
//        }else{
//        	if(folder.exists()){
//        		System.out.println("文件夹已经存在");
//        	}else{
//        		System.out.println("文件夹创建失败");
//        		
//        	}
//        }
        File folder = new File("my new file-new/two/three");
        File newfolder = new File("my new file-new/three");
        if(folder.renameTo(newfolder)){
        	System.out.println("done");
        }else{
        	System.out.println("fail");
        }
        
    }
}
