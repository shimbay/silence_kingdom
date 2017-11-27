package org.rainbow.silence_kingdom.view;

import org.rainbow.silence_kingdom.conts.ViewType;
import org.rainbow.silence_kingdom.models.Card;
import org.rainbow.silence_kingdom.util.Crypto;
import org.rainbow.silence_kingdom.util.DB;

import javax.swing.*;
import java.awt.*;

/**
 * Copyright (c) by Megvii.com.
 * Created by Rainbow Sun.
 * Date: 2017/10/21.
 * Time: 下午5:44.
 * Description:
 */
public class DetailView extends BaseView {
    private JPanel panel1;
    private Card card;

    protected DetailView(BaseFrame baseFrame, int cardId) {
        super(baseFrame);
        $$$setupUI$$$();
        card = DB.queryCardById(cardId);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        panel1 = new JPanel() {
            @Override protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon(Crypto.decode(card.getImagePath()));
                Image img = icon.getImage();
                g.drawImage(img, 0, 0, icon.getIconWidth(),
                        icon.getIconHeight(), icon.getImageObserver());
            }
        };
    }

    @Override ViewType getViewType() {
        return null;
    }

    @Override Container getView() {
        return panel1;
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
