package org.rainbow.silence_kingdom.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import org.rainbow.silence_kingdom.conts.ViewType;
import org.rainbow.silence_kingdom.util.Crypto;
import org.rainbow.silence_kingdom.util.Meta;

import javax.swing.*;
import java.awt.*;

/**
 * Copyright (c) by Megvii.com.
 * Created by Rainbow Sun.
 * Date: 2017/10/21.
 * Time: 下午3:21.
 * Description:
 */
public class ProducerView extends BaseView {
    private JPanel panel;
    private JLabel label;

    protected ProducerView(BaseFrame baseFrame) {
        super(baseFrame);
    }

    @Override ViewType getViewType() {
        return null;
    }

    @Override Container getView() {
        return panel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        panel = new JPanel() {
            @Override protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon(Crypto.decode(Meta.IMG_DIR.getAbsolutePath() + "/text_background.jpg"));
                Image img = icon.getImage();
                g.drawImage(img, 0, 0, icon.getIconWidth(),
                        icon.getIconHeight(), icon.getImageObserver());
            }
        };
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null)
            return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    {
        // GUI initializer generated by IntelliJ IDEA GUI Designer
        // >>> IMPORTANT!! <<<
        // DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
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
        panel.setLayout(new GridLayoutManager(4, 1, new Insets(0, 0, 0, 0), -1, -1));
        label = new JLabel();
        Font labelFont = this.$$$getFont$$$("Monaco", Font.BOLD, 20, label.getFont());
        if (labelFont != null)
            label.setFont(labelFont);
        label.setText("策划/美术: 籍小婷 15810079142");
        panel.add(label,
                new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0,
                        false));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Monaco", Font.BOLD, 20, label1.getFont());
        if (label1Font != null)
            label1.setFont(label1Font);
        label1.setText("程序: 孙云博 13716762577");
        panel.add(label1,
                new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0,
                        false));
        final Spacer spacer1 = new Spacer();
        panel.add(spacer1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel.add(spacer2, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }
}
