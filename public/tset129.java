class Node
{
int info;
Node left,right;
Node(int val)
{
info=val;
left=right=null;
}
}
public class tset129
{
Node root;
Node insert(Node root,int val)
{
if(root==null)
{
root=new Node(val);
return root;
}
if(val<root.info)
root.left=insert(root.left,val);
else
{
if(val>root.info)
{
root.right=insert(root.right,val);
}
}
return root;
}
public void preorder(Node root)
{
if(root!=null)
{
System.out.print(" " +root.info);
preorder(root.left);
preorder(root.right);
}
}
public int numLeafNodes(Node root) {
if (root == null)
return 0;
if (root.left == null && root.right == null)
return 1;
else
return (numLeafNodes(root.right) + numLeafNodes(root.left));
}

public void postorder(Node root)
{
if(root!=null)
{
postorder(root.left);
postorder(root.right);
System.out.print(" " +root.info);
}
}
public void inorder(Node root)
{
if(root!=null)
{
inorder(root.left);
System.out.print(" " +root.info);
inorder(root.right);
}
}
public int findmin(Node root)
{
while(root.left!=null)
root=root.left;
return root.info;
}
public int findmax(Node root)
{
while(root.right!=null)
root=root.right;
return root.info;
}
public boolean find(Node root,int item)
{
while(root!=null)
{
if(root.info==item)
return true;
else
{
if(item<root.info)
root=root.left;
else
root=root.right;
}
}
return false;
}
boolean isBST(Node root)
{
if(root==null)
return true;
if(root.left!=null && findmax(root.left)>root.info)
return false;
if(root.right!=null && findmin(root.right)<root.info)
return false;
return(isBST(root.left) && isBST(root.right));
}
public static void main(String [] args)
{
tset129 t=new tset129();
int a[]={10,30,20,40,50};
for(int i=0;i<a.length;i++)
{
t.root=t.insert(t.root,a[i]);
}
t.preorder(t.root);
System.out.println();
t.postorder(t.root);
System.out.println();
t.inorder(t.root);
System.out.println();
System.out.println(t.findmin(t.root));
System.out.println(t.findmax(t.root));
System.out.println(t.find(t.root,25));
System.out.println(t.isBST(t.root));
System.out.println(t.numLeafNodes(t.root));
}
}
