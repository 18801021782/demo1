package com.lzx.hadoop;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;


public class HdfsClient {

    @Test
    public void put(){

        try {

            FileSystem  fileSystem =  FileSystem.get(URI.create("hdfs://192.168.1.104:9000"),new Configuration(),"root");
            fileSystem.copyFromLocalFile(new Path("d://111.txt"),new Path("/"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
