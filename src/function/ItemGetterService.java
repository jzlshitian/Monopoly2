package function;

import static game.Game.getInstance;

import game.Menu;
import object.Player;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by jzl on 16/4/23.
 */
public class ItemGetterService {
    public void serve(ArrayList<Player> players, int currentPlayer) {
        Player player = players.get(currentPlayer);

        int index = (int)(Math.random()*7);
        player.addItem(index, 1);
        String message = "你获得了"+Menu.ITEM_NAMES[index];
        JOptionPane.showMessageDialog(null, message, "赠卡点", JOptionPane.INFORMATION_MESSAGE);
        getInstance().nextPlayer(6);
    }
}
