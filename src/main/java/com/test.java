package com;

import org.apache.shiro.crypto.hash.Md5Hash;

public class test {
    public static void main(String[] args) {
        String pwd = "123123123";
        System.out.println(new Md5Hash(pwd,"874374490@qq.com"));//163b53470cb0990679c8aaef28deabaf
    }
}
