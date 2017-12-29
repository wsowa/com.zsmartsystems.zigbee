/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.touchlink;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;

/**
 * Network Join Router Command value object class.
 * <p>
 * The network join router request command frame is used by a non-factory-new initiator to
 * join a router to its network.
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class NetworkJoinRouterCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public NetworkJoinRouterCommand() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 18;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(27);
        builder.append("NetworkJoinRouterCommand [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
