import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import java.awt.BorderLayout;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

public class App extends JFrame{
	
	public static void main(String args[]) {
        
        App a = new App();
    }

	public App() {
        
        super("Chest Anatomy Solution");
        setSize(500, 400);
        getContentPane().setLayout(new BorderLayout());
        setResizable(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		final JCheckBoxTree cbt = createTree();
		getContentPane().add(cbt);

		setVisible(true);
    }

    private JCheckBoxTree createTree(){
		DefaultMutableTreeNode chest = new DefaultMutableTreeNode("Chest");
		DefaultMutableTreeNode lungs = new DefaultMutableTreeNode("Lungs");
		DefaultMutableTreeNode rLung = new DefaultMutableTreeNode("Right Lung");
		DefaultMutableTreeNode rsLobe = new DefaultMutableTreeNode("Superior Lobe");
		DefaultMutableTreeNode rmLobe = new DefaultMutableTreeNode("Middle Lobe");
		DefaultMutableTreeNode riLobe = new DefaultMutableTreeNode("Inferior Lobe");
		DefaultMutableTreeNode lLung = new DefaultMutableTreeNode("Left Lung");
		DefaultMutableTreeNode lsLobe = new DefaultMutableTreeNode("Superior Lobe");
		DefaultMutableTreeNode liLobe = new DefaultMutableTreeNode("Inferior Lobe");
		DefaultMutableTreeNode heart = new DefaultMutableTreeNode("Heart");   
		DefaultMutableTreeNode lVentricle = new DefaultMutableTreeNode("Left Ventricle");
		DefaultMutableTreeNode rVentricle = new DefaultMutableTreeNode("Right Ventricle");
		DefaultMutableTreeNode lAtrium = new DefaultMutableTreeNode("Left Atrium");
		DefaultMutableTreeNode rAtrium = new DefaultMutableTreeNode("Right Atrium");
		DefaultMutableTreeNode septum = new DefaultMutableTreeNode("Septum");

		chest.add(lungs);
		chest.add(heart);
		lungs.add(rLung);
		rLung.add(rsLobe);
		rLung.add(rmLobe);
		rLung.add(riLobe);
		lungs.add(lLung);
		lLung.add(lsLobe);
		lLung.add(liLobe);
		heart.add(lVentricle);
		heart.add(rVentricle);
		heart.add(lAtrium);
		heart.add(rAtrium);
		heart.add(septum);

		return new JCheckBoxTree(chest);
    }

} 

