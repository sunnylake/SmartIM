/*
 * Copyright 2014-2018 ieclipse.cn.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ieclipse.smartim.actions;

import java.awt.event.ActionEvent;

import cn.ieclipse.smartim.console.IMChatConsole;
import icons.SmartIcons;

/**
 * 类/接口描述
 * 
 * @author Jamling
 * @date 2018年2月24日
 *      
 */
public class ClearHistoryAction extends IMChatAction {
    
    public ClearHistoryAction(IMChatConsole console) {
        super(console, SmartIcons.clear);
        setText("");
        setToolTipText("Clear history");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (console != null) {
            console.clearHistories();
        }
    }
}
