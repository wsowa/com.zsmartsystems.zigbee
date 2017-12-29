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
 * Device Information Response value object class.
 * <p>
 * The device information response command frame is used to return information
 * about the sub-devices sup-ported by a node
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class DeviceInformationResponse extends ZclCommand {
    /**
     * Default constructor.
     */
    public DeviceInformationResponse() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 3;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(28);
        builder.append("DeviceInformationResponse [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
