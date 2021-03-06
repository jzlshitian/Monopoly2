package item;

import game.Map;
import object.Player;
import object.Stock;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by jzl on 16/4/25.
 */
public class DividePropertyCard extends Item {
    public DividePropertyCard() {
        this.itemIndex = 3;
        this.name = "均富卡";
    }

    @Override
    public void use(Stock[] stocks, Map map, ArrayList<Player> players, int currentPlayer){
        super.use(stocks, map, players, currentPlayer);

        int sigma = 0;

        for (int i=0;i<players.size();i++)
            sigma += players.get(i).getCash();

        int mean = sigma / players.size();

        for (int i=0;i<players.size();i++)
            players.get(i).setCash(mean);

        JOptionPane.showMessageDialog(null, "你使用了均富卡", "均富卡", JOptionPane.INFORMATION_MESSAGE);
    }
}
