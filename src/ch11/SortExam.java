package ch11;

import java.util.Arrays;

public class SortExam
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] score = {99,97,98};
        Arrays.sort(score);
        
        for(int i = 0 ; i < score.length; i++)
            System.out.println("score["+i+"]="+score[i]);
        
        System.out.println();
        String[] names = {"�垮瘚�","夢翕熱","梯團熱"};
        Arrays.sort(names);
        for(int i = 0 ; i < names.length; i++)
            System.out.println("names["+i+"]="+names[i]);
        
        
        System.out.println("天天天天天天天天天天天天天天天天天天天天天");
        Member m1 = new Member("�垮瘚�",10);
        Member m2 = new Member("夢翕熱",22);
        Member m3 = new Member("梯團熱",100);
        Member[] members = {m1,m2,m3};
        
        Arrays.sort(members);
        
        for(int i = 0 ; i < members.length; i++)
        {
            System.out.println("members["+i+"].name=" + members[i].name+"members["+i+"].age=" + members[i].age);
        }

    }
    
}
