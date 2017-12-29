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
 * Network Start Response value object class.
 * <p>
 * The network start response command frame is used by a router to respond to a
 * network start request command frame received from an end device.
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class NetworkStartResponse extends ZclCommand {
    /**
     * Default constructor.
     */
    public NetworkStartResponse() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 17;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(23);
        builder.append("NetworkStartResponse [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
