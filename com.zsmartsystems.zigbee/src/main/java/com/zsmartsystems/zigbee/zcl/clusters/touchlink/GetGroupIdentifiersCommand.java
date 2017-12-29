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
 * Get Group Identifiers Command value object class.
 * <p>
 * The get group identifiers request command is used to retrieve the actual
 * group identifiers that the endpoint is using in its multicast communication
 * in controlling different(remote) devices.
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class GetGroupIdentifiersCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public GetGroupIdentifiersCommand() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 65;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(29);
        builder.append("GetGroupIdentifiersCommand [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
