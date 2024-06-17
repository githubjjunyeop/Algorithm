package Al_05_Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Greddy_활동선택_회의실배정 {
	 static class Meeting {
	        int start;
	        int end;

	        Meeting(int start, int end) {
	            this.start = start;
	            this.end = end;
	        }
	    }

	    // 그리디 알고리즘을 사용하여 최대 회의 개수 계산
	    public static int maxMeetings(Meeting[] meetings) {
	        // 종료 시간을 기준으로 회의 정렬
	        Arrays.sort(meetings, Comparator.comparingInt(m -> m.end));

	        int count = 0;
	        int lastEndTime = 0;

	        // 회의를 하나씩 검사하여 선택
	        for (Meeting meeting : meetings) {
	            if (meeting.start >= lastEndTime) {
	                count++;
	                lastEndTime = meeting.end;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Meeting[] meetings = {
	            new Meeting(1, 2),
	            new Meeting(3, 4),
	            new Meeting(0, 6),
	            new Meeting(5, 7),
	            new Meeting(8, 9),
	            new Meeting(5, 9)
	        };

	        int result = maxMeetings(meetings);

	        System.out.println("최대 회의 개수: " + result);
	    }

}
