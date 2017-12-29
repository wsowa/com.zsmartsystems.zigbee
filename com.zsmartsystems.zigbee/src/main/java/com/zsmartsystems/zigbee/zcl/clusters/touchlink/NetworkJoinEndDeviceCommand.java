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
 * Network Join End Device Command value object class.
 * <p>
 * The network join end device request command frame is used by a
 * non-factory-new initiator to join a factory new end device to its network.
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class NetworkJoinEndDeviceCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public NetworkJoinEndDeviceCommand() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 20;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(30);
        builder.append("NetworkJoinEndDeviceCommand [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
