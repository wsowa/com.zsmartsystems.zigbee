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
 * Network Update Command value object class.
 * <p>
 * The network update request command frame is used to attempt to bring
 * a router that may have missed a network update back onto the network.
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class NetworkUpdateCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public NetworkUpdateCommand() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 22;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(23);
        builder.append("NetworkUpdateCommand [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
