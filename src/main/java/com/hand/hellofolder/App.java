package com.hand.hellofolder;

import java.io.File;

public class App 
{
    public static void main( String[] args )
    {
        File folder = new File("my new file");
        if(folder.mkdirs()){
        	System.out.println("文件夹创建成功");
        }else{
        	if(folder.exists()){
        		System.out.println("文件夹已经存在");
        	}else{
        		System.out.println("文件夹创建失败");
        		
        	}
        }
        
    }
}
