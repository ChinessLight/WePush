package com.fangxuele.tool.wechat.push.ui.listener;

import com.fangxuele.tool.wechat.push.ui.MainWindow;
import com.xiaoleilu.hutool.log.Log;
import com.xiaoleilu.hutool.log.LogFactory;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by rememberber(https://github.com/rememberber) on 2018/2/9.
 */
public class HelpListener {
    private static final Log logger = LogFactory.get();

    public static void addListeners() {
        MainWindow.mainWindow.getLabelOnlineHelp().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI("https://github.com/rememberber/WePush/wiki"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                MainWindow.mainWindow.getLabelOnlineHelp().setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

        });
    }
}
