/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>(); Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Queue<Node> q = new LinkedList<>();
        Map<Node,Node> on = new HashMap<>();

        on.put(node, new Node(node.val));
        q.add(node);

        while(!q.isEmpty()){
            Node cur = q.poll();
            for(Node n: cur.neighbors){
                if(!on.containsKey(n)){
                    on.put(n, new Node(n.val));
                    q.offer(n);
                }
                on.get(cur).neighbors.add(on.get(n));
            }
        }
        return on.get(node);
        
    }
}