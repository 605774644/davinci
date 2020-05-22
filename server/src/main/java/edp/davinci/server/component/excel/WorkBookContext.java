/*
 * <<
 *  Davinci
 *  ==
 *  Copyright (C) 2016 - 2020 EDP
 *  ==
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  >>
 *
 */

package edp.davinci.server.component.excel;

import lombok.Builder;
import lombok.Data;
import org.slf4j.Logger;

import edp.davinci.server.model.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author daemon
 * @Date 19/5/29 19:26
 * To change this template use File | Settings | File Templates.
 */
@Data
@Builder
public class WorkBookContext implements Serializable {

    private MsgWrapper wrapper;

    private List<WidgetContext> widgets;

    private User user;

    private int resultLimit;

    private String taskKey;

    private Logger customLogger;

    /**
     * 0.4 member variables
     */
    private String queryModel;
}
