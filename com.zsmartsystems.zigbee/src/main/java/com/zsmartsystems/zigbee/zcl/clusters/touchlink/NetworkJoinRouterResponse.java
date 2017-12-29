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
 * Network Join Router Response value object class.
 * <p>
 * The network join router response command frame is used by a router to respond
 * to a network join router request command frame received from a non-factory-new end device.
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class NetworkJoinRouterResponse extends ZclCommand {
    /**
     * Default constructor.
     */
    public NetworkJoinRouterResponse() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 19;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(28);
        builder.append("NetworkJoinRouterResponse [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
