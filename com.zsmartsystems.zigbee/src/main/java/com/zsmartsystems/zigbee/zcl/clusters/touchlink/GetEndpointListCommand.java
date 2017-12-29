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
 * Get Endpoint List Command value object class.
 * <p>
 * The get endpoint list request command is  used to retrieve addressing
 * information  for  each  endpoint the device is using in its unicast communication
 * in controlling different (remote) devices.
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class GetEndpointListCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public GetEndpointListCommand() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 66;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(25);
        builder.append("GetEndpointListCommand [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
