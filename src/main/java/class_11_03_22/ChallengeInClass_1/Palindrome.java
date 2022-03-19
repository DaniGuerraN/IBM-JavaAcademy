package class_11_03_22.ChallengeInClass_1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {

    public boolean isPalindrome(String word){
        Queue<String> queue = new LinkedList<>();
        Deque<String> dequeue = new LinkedList<>();

        for(String str: word.split("")){
            queue.offer(String.valueOf(str));
            dequeue.offer(String.valueOf(str));
        }

        while(!queue.isEmpty()){
            if(!queue.poll().equals(dequeue.pollLast())){
                return false;
            }
        }
        return true;

    }
}
