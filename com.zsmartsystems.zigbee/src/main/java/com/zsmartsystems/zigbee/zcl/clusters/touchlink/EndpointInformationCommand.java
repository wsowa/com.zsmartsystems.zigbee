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
 * Endpoint Information Command value object class.
 * <p>
 * The endpoint information command is used to inform the remote endpoint about the
 * general information of the local endpoint. This command may be a trigger for the remote
 * endpoint to get more information from the local device using the other commands described
 * in this cluster.
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class EndpointInformationCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public EndpointInformationCommand() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 64;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(29);
        builder.append("EndpointInformationCommand [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
