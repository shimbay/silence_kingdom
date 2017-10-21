package org.rainbow.silence_kingdom.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import org.rainbow.silence_kingdom.conts.ViewType;
import org.rainbow.silence_kingdom.util.Meta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Copyright (c) by Megvii.com.
 * Created by Rainbow Sun.
 * Date: 2017/10/8.
 * Time: 下午6:52.
 * Description:
 */
public class WelcomeView extends BaseView {
    private JButton startButton;
    private JButton cardButton;
    private JPanel panel;
    private JButton settingButton;
    private JButton travelDescriptionButton;
    private JButton producerButton;
    private JPanel panel1;

    protected WelcomeView(BaseFrame baseFrame) {
        super(baseFrame);
        $$$setupUI$$$();
        startButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                baseFrame.viewSwitch(new AudioRecordView(baseFrame));
            }
        });

        travelDescriptionButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                baseFrame.viewSwitch(new DescriptionView(baseFrame));
            }
        });

        cardButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                baseFrame.viewSwitch(new ListView(baseFrame));
            }
        });

        settingButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                baseFrame.viewSwitch(new SettingView(baseFrame));
            }
        });
    }

    @Override ViewType getViewType() {
        return ViewType.WELCOME_PAGE;
    }

    @Override Container getView() {
        return panel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        panel = new JPanel() {
            @Override protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon(Meta.IMG_DIR.getAbsolutePath() + "/backgroud.jpg");
                Image img = icon.getImage();
                g.drawImage(img, 0, 0, icon.getIconWidth(),
                        icon.getIconHeight(), icon.getImageObserver());
            }
        };
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
        panel.setLayout(new GridBagLayout());
        panel.setMinimumSize(new Dimension(204, 204));
        panel.setOpaque(true);
        panel.setPreferredSize(new Dimension(-1, -1));
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setMinimumSize(new Dimension(204, 204));
        panel1.setOpaque(false);
        panel1.setVisible(true);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(panel1, gbc);
        cardButton = new JButton();
        cardButton.setText("卡牌库");
        panel1.add(cardButton,
                new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        startButton = new JButton();
        startButton.setBorderPainted(true);
        startButton.setDefaultCapable(true);
        startButton.setText("开始旅程");
        panel1.add(startButton,
                new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        settingButton = new JButton();
        settingButton.setText("设置");
        panel1.add(settingButton,
                new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        travelDescriptionButton = new JButton();
        travelDescriptionButton.setText("旅行指南");
        panel1.add(travelDescriptionButton,
                new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        producerButton = new JButton();
        producerButton.setText("制作人员");
        panel1.add(producerButton,
                new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setMinimumSize(new Dimension(1000, 24));
        panel2.setOpaque(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(panel2, gbc);
        final Spacer spacer1 = new Spacer();
        panel2.add(spacer1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }
}
