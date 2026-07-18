class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
        }
        for(int[] edge: prerequisites){
            indegree[edge[1]]++;
            graph.get(edge[0]).add(edge[1]);;
        }
        Queue<Integer> bfs = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i]== 0) bfs.offer(i);
        }
        int finish = 0;
        while(!bfs.isEmpty()){
            int course = bfs.poll();
            finish++;
            for(int e: graph.get(course)){
                indegree[e]--;
                if(indegree[e] == 0){
                    bfs.add(e);
                }
            }
        }
        return finish == numCourses;
    }
}
