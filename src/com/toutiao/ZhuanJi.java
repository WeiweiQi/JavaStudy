package com.toutiao;

import java.util.Scanner;

public class ZhuanJi {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();//n�׸�
            int s = in.nextInt();//ÿ�׸�s��
            int l = in.nextInt();//ÿ��CD��l��
            //--------------------------------
            int count = (l+1)/(s+1);//����Ҫ���1��
            count = Math.min(n, count);
            if(count%13==0){//������13�ı���
                count--;
            }
            int sum = n/count;//n>countȡ��
            int yu = n%count;//ȡ��
            if(yu!=0){
                sum++;
                if(yu%13==0&&(count-yu)==1){//�鿴������һ��ר�������
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
