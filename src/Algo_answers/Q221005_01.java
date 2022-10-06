package Algo_answers;

import java.util.*;
//���� ����
/*
//https://programmers.co.kr/learn/courses/30/lessons/42840
/*
�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.
1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
���� ����
������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
����� ��
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
����� �� ����
����� �� #1
������ 1�� ��� ������ �������ϴ�.
������ 2�� ��� ������ Ʋ�Ƚ��ϴ�.
������ 3�� ��� ������ Ʋ�Ƚ��ϴ�.
���� ���� ������ ���� ���� ����� ������ 1�Դϴ�.
����� �� #2
��� ����� 2�������� ������ϴ�.

*/

public class Q221005_01 {
    static int[] answer1 = {1,2,3,4,5};
    static int[] answer2 = {1,3,2,4,2};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(answer1)));
        System.out.println(Arrays.toString(solution(answer2)));
    }

    public static int[] solution(int[] answers) {
        int[] result = new int[0];

        int[] supo1pick = {1,2,3,4,5};
        int[] supo2pick = {2,1,2,3,2,4,2,5};
        int[] supo3pick = {3,3,1,1,2,2,4,4,5,5};

        int supo1right = 0;
        int supo2right = 0;
        int supo3right = 0;

        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];

            if (answer == supo1pick[i%5]) {
                supo1right++;
            }
            if (answer == supo2pick[i%8]) {
                supo2right++;
            }
            if (answer == supo3pick[i%10]) {
                supo3right++;
            }
        }

        if (supo1right > supo2right) {
            // 1>2
            if (supo1right > supo3right) {
                // 1>2?3
                result = new int[]{1};
            } else if (supo1right == supo3right) {
                // 1=3>2
                result = new int[]{1,3};
            } else if (supo1right < supo3right) {
                // 3>1>2
                result = new int[]{3};
            }
        } else if (supo1right == supo2right) {
            // 1=2
            if (supo1right > supo3right) {
                // 1=2>3
                result = new int[]{1,2};
            } else if (supo1right == supo3right) {
                // 1=3=2
                result = new int[]{1,2,3};
            } else if (supo1right < supo3right) {
                // 3>1=2
                result = new int[]{3};
            }
        } else {
            // 2>1
            if (supo2right > supo3right) {
                // 2>1?3
                result = new int[]{2};
            } else if (supo2right == supo3right) {
                // 2=3>1
                result = new int[]{2,3};
            } else if (supo2right < supo3right) {
                // 3>2>1
                result = new int[]{3};
            }
        }

        // ������ �� �̹� ���ĵ� ���·� �����ϱ� ������ ���� �ʿ� ����.
        // Arrays.sort(result);
        return result;
    }
}
