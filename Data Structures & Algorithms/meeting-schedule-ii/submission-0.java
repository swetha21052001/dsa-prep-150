/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
       if (intervals == null || intervals.size() == 0)
            return 0;

        // Sort by meeting start time
        Collections.sort(intervals, (a, b) -> a.start - b.start);

        // Min heap stores meeting end times
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Interval interval : intervals) {
            // If the earliest ending meeting is over,
            // reuse that room.
            if (!pq.isEmpty() && pq.peek() <= interval.start) {
                pq.poll();
            }

            // Allocate current meeting
            pq.offer(interval.end);
        }

        return pq.size();  
    }
}
