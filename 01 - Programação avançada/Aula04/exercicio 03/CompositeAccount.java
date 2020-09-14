import java.util.ArrayList;
import java.util.List;

public class CompositeAccount extends Component 
{
    protected List<Component> list = new ArrayList<>(); 
    
    public void add(Component g) {
        list.add(g);
    }
 
    public void remove(Component g) {
        list.remove(g);
    }
 
    public Component getChild(int i) {
        return (Component) list.get(i);
    }
    
    public float getBalance() {
        float totalBalance = 0;
        for (Component f : list) {
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }
}