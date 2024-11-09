class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) { this.val = val; this.left = null; this.right = null;}
}
public class MC1 {
    public int rangeSumBST(TreeNode root, int low, int high){
        if(root == null) return 0;
        int sum =0;

        if(root.val>low){
            sum+=rangeSumBST(root.left,low,high);
        }
        if(root.val<high){
            sum+=rangeSumBST(root.right,low,high);
        }

        if(root.val>=low &&root.val<=high){
            sum+=root.val;
        }

        return sum;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(15);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(7);
        root1.right.right = new TreeNode(18);

        MC1 bstRangeSum = new MC1();
        int result1 = bstRangeSum.rangeSumBST(root1, 7, 15);
        assert result1 == 32: "Test 1 Failed";
        System.out.println(result1);
        System.out.println("Test 1 Passed");

        int result2 = bstRangeSum.rangeSumBST(root1, 1, 20);
        assert result2 == 53: "Test 1 Failed";
        System.out.println(result2);
        System.out.println("Test 2 Passed");

    }

}
