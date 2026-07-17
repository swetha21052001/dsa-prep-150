class Solution {
    private int find(int[] parent, int node){
        if(parent[node] != node){
            parent[node] = find(parent, parent[node]);
        }
        return parent[node];
    }
    private void union(int[] parent, int n1, int n2){
       int parent_1 = find(parent,n1);
       int parent_2 = find(parent,n2);
       parent[parent_1] = parent_2;
    }
    public int countComponents(int n, int[][] edges) {
        int[] parent = new int[n];
        for(int i=0;i<n;i++) parent[i] = i;
        for(int[] edge: edges){
            union(parent, edge[0], edge[1]);
        }
        Set<Integer> comp = new HashSet<>();
        for(int i: parent){
            comp.add(find(parent,i));
        }
        return comp.size();
    }
}
