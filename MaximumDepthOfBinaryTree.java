//https://leetcode.com/problems/maximum-depth-of-binary-tree/
class Solution {
    public int maxDepth(TreeNode root) {
          List<List<Integer>> result=new LinkedList<>();
        if(root==null)
            return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
         int count=1;
        while(!queue.isEmpty()){
            int level=queue.size();
            List<Integer> sub=new LinkedList<>();
            for(int i=0;i<level;i++){
            TreeNode s=queue.poll();
            sub.add(s.val);
            if(s.left!=null)
                queue.offer(s.left);
            if(s.right!=null)
                queue.offer(s.right);
                
            }
          result.add(sub); 
        }
        return result.size();
    }
}
