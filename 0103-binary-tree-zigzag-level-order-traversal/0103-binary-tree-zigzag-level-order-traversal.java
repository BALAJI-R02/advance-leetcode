class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean ltor = true;

        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> l = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                if (ltor) {
                    l.add(node.val);
                } else {
                    l.add(0, node.val);
                }

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            ans.add(l);
            ltor = !ltor;
        }

        return ans;
    }
}