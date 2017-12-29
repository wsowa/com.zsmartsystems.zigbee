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
 * Get Endpoint List Response value object class.
 * <p>
 * The get endpoint list response command allows a remote device to respond to the get
 * endpoint list request command.
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class GetEndpointListResponse extends ZclCommand {
    /**
     * Default constructor.
     */
    public GetEndpointListResponse() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 66;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(26);
        builder.append("GetEndpointListResponse [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
