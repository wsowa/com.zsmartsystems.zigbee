/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters;

import com.zsmartsystems.zigbee.CommandResult;
import com.zsmartsystems.zigbee.ZigBeeEndpoint;
import com.zsmartsystems.zigbee.ZigBeeNetworkManager;
import com.zsmartsystems.zigbee.zcl.ZclAttribute;
import com.zsmartsystems.zigbee.zcl.ZclCluster;
import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.DeviceInformationCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.DeviceInformationResponse;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.EndpointInformationCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.GetEndpointListCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.GetEndpointListResponse;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.GetGroupIdentifiersCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.IdentifyCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.NetworkJoinEndDeviceCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.NetworkJoinEndDeviceResponse;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.NetworkJoinRouterCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.NetworkJoinRouterResponse;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.NetworkStartCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.NetworkStartResponse;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.NetworkUpdateCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.ResetToFactoryNewCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.ScanCommand;
import com.zsmartsystems.zigbee.zcl.clusters.touchlink.ScanResponse;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/**
 * <b>Touchlink</b> cluster implementation (<i>Cluster ID 0x1000</i>).
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class ZclTouchlinkCluster extends ZclCluster {
    /**
     * The ZigBee Cluster Library Cluster ID
     */
    public static final int CLUSTER_ID = 0x1000;

    /**
     * The ZigBee Cluster Library Cluster Name
     */
    public static final String CLUSTER_NAME = "Touchlink";

    // Attribute initialisation
    protected Map<Integer, ZclAttribute> initializeAttributes() {
        Map<Integer, ZclAttribute> attributeMap = new ConcurrentHashMap<Integer, ZclAttribute>(0);

        return attributeMap;
    }

    /**
     * Default constructor to create a Touchlink cluster.
     *
     * @param zigbeeManager {@link ZigBeeNetworkManager}
     * @param zigbeeEndpoint the {@link ZigBeeEndpoint}
     */
    public ZclTouchlinkCluster(final ZigBeeNetworkManager zigbeeManager, final ZigBeeEndpoint zigbeeEndpoint) {
        super(zigbeeManager, zigbeeEndpoint, CLUSTER_ID, CLUSTER_NAME);
    }


    /**
     * The Scan Command
     * <p>
     * The scan request command frame is used to initiate a scan for other devices in the vicinity
     * of the originator. The information contained in this command frame relates to the scan
     * request initiator.
     * <br>
     * This  inter-PAN command  shall  be  formatted  according  to  the  general  inter-PAN  frame
     * format  with  the following clarifications. In the MAC header, the ACK request and destination
     * addressing mode sub-fields of the frame control field shall be set to 0 (no ACK requested)
     * and 0b10 (short network address), respectively, the destination address field shall be set
     * to 0xffff (broadcast network address) and the source PAN ID field shall be set to any value
     * in the range 0x0001 –0xfffe, if the device is factory new, or the PAN identifier of the device,
     * otherwise. In the APS header, the delivery mode sub-field of the frame control field shall be
     * set to 0b10 (broadcast). In the ZCL header, the direction sub-field of the frame control field
     * shall be set to 0 (client to server) and the command identifier shall be set to 0x00 (scan request).
     *
     * @param interPanTransactionId {@link Integer} InterPan transaction ID
     * @param zigBeeInformation {@link Integer} ZigBee information
     * @param touchlinkInformation {@link Integer} Touchlink Information
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> scanCommand(Integer interPanTransactionId, Integer zigBeeInformation, Integer touchlinkInformation) {
        ScanCommand command = new ScanCommand();

        // Set the fields
        command.setInterPanTransactionId(interPanTransactionId);
        command.setZigBeeInformation(zigBeeInformation);
        command.setTouchlinkInformation(touchlinkInformation);

        return send(command);
    }

    /**
     * The Device Information Command
     * <p>
     * The device information request command frame is used to request information regarding the
     * sub-devices of a remote device
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> deviceInformationCommand() {
        DeviceInformationCommand command = new DeviceInformationCommand();

        return send(command);
    }

    /**
     * The Identify Command
     * <p>
     * The identify request command frame is used to request that the recipient identifies itself
     * in some application specific way to aid with touchlinking
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> identifyCommand() {
        IdentifyCommand command = new IdentifyCommand();

        return send(command);
    }

    /**
     * The Reset to Factory New Command
     * <p>
     * The reset to factory new request command frame is used to request that the recipient resets
     * itself back to its factory new state.
     *
     * @param interPanTransactionId {@link Integer} InterPan transaction ID
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> resetToFactoryNewCommand(Integer interPanTransactionId) {
        ResetToFactoryNewCommand command = new ResetToFactoryNewCommand();

        // Set the fields
        command.setInterPanTransactionId(interPanTransactionId);

        return send(command);
    }

    /**
     * The Network Start Command
     * <p>
     * The network start request command frame is used by a factory new initiator to form a
     * new network with a router.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> networkStartCommand() {
        NetworkStartCommand command = new NetworkStartCommand();

        return send(command);
    }

    /**
     * The Network Join Router Command
     * <p>
     * The network join router request command frame is used by a non-factory-new initiator to
     * join a router to its network.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> networkJoinRouterCommand() {
        NetworkJoinRouterCommand command = new NetworkJoinRouterCommand();

        return send(command);
    }

    /**
     * The Network Join End Device Command
     * <p>
     * The network join end device request command frame is used by a
     * non-factory-new initiator to join a factory new end device to its network.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> networkJoinEndDeviceCommand() {
        NetworkJoinEndDeviceCommand command = new NetworkJoinEndDeviceCommand();

        return send(command);
    }

    /**
     * The Network Update Command
     * <p>
     * The network update request command frame is used to attempt to bring
     * a router that may have missed a network update back onto the network.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> networkUpdateCommand() {
        NetworkUpdateCommand command = new NetworkUpdateCommand();

        return send(command);
    }

    /**
     * The Get Group Identifiers Command
     * <p>
     * The get group identifiers request command is used to retrieve the actual
     * group identifiers that the endpoint is using in its multicast communication
     * in controlling different(remote) devices.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getGroupIdentifiersCommand() {
        GetGroupIdentifiersCommand command = new GetGroupIdentifiersCommand();

        return send(command);
    }

    /**
     * The Get Endpoint List Command
     * <p>
     * The get endpoint list request command is  used to retrieve addressing
     * information  for  each  endpoint the device is using in its unicast communication
     * in controlling different (remote) devices.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getEndpointListCommand() {
        GetEndpointListCommand command = new GetEndpointListCommand();

        return send(command);
    }

    /**
     * The Scan Response
     * <p>
     * The scan response command frame is used to respond to the originator
     * of a scan request command frame with device details. The information
     * contained in this command frame relates to the target that is responding to
     * the scan request command frame.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> scanResponse() {
        ScanResponse command = new ScanResponse();

        return send(command);
    }

    /**
     * The Device Information Response
     * <p>
     * The device information response command frame is used to return information
     * about the sub-devices sup-ported by a node
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> deviceInformationResponse() {
        DeviceInformationResponse command = new DeviceInformationResponse();

        return send(command);
    }

    /**
     * The Network Start Response
     * <p>
     * The network start response command frame is used by a router to respond to a
     * network start request command frame received from an end device.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> networkStartResponse() {
        NetworkStartResponse command = new NetworkStartResponse();

        return send(command);
    }

    /**
     * The Network Join Router Response
     * <p>
     * The network join router response command frame is used by a router to respond
     * to a network join router request command frame received from a non-factory-new end device.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> networkJoinRouterResponse() {
        NetworkJoinRouterResponse command = new NetworkJoinRouterResponse();

        return send(command);
    }

    /**
     * The Network Join End Device Response
     * <p>
     * The network join end device response command frame is used by a factory new end
     * device to respond to a network join end device request command frame received
     * from a non-factory new end device.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> networkJoinEndDeviceResponse() {
        NetworkJoinEndDeviceResponse command = new NetworkJoinEndDeviceResponse();

        return send(command);
    }

    /**
     * The Endpoint Information Command
     * <p>
     * The endpoint information command is used to inform the remote endpoint about the
     * general information of the local endpoint. This command may be a trigger for the remote
     * endpoint to get more information from the local device using the other commands described
     * in this cluster.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> endpointInformationCommand() {
        EndpointInformationCommand command = new EndpointInformationCommand();

        return send(command);
    }

    /**
     * The Get Endpoint List Response
     * <p>
     * The get endpoint list response command allows a remote device to respond to the get
     * endpoint list request command.
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getEndpointListResponse() {
        GetEndpointListResponse command = new GetEndpointListResponse();

        return send(command);
    }

    @Override
    public ZclCommand getCommandFromId(int commandId) {
        switch (commandId) {
            case 0: // SCAN_COMMAND
                return new ScanCommand();
            case 2: // DEVICE_INFORMATION_COMMAND
                return new DeviceInformationCommand();
            case 6: // IDENTIFY_COMMAND
                return new IdentifyCommand();
            case 7: // RESET_TO_FACTORY_NEW_COMMAND
                return new ResetToFactoryNewCommand();
            case 16: // NETWORK_START_COMMAND
                return new NetworkStartCommand();
            case 18: // NETWORK_JOIN_ROUTER_COMMAND
                return new NetworkJoinRouterCommand();
            case 20: // NETWORK_JOIN_END_DEVICE_COMMAND
                return new NetworkJoinEndDeviceCommand();
            case 22: // NETWORK_UPDATE_COMMAND
                return new NetworkUpdateCommand();
            case 65: // GET_GROUP_IDENTIFIERS_COMMAND
                return new GetGroupIdentifiersCommand();
            case 66: // GET_ENDPOINT_LIST_COMMAND
                return new GetEndpointListCommand();
            default:
                return null;
        }
    }

    @Override
    public ZclCommand getResponseFromId(int commandId) {
        switch (commandId) {
            case 1: // SCAN_RESPONSE
                return new ScanResponse();
            case 3: // DEVICE_INFORMATION_RESPONSE
                return new DeviceInformationResponse();
            case 17: // NETWORK_START_RESPONSE
                return new NetworkStartResponse();
            case 19: // NETWORK_JOIN_ROUTER_RESPONSE
                return new NetworkJoinRouterResponse();
            case 21: // NETWORK_JOIN_END_DEVICE_RESPONSE
                return new NetworkJoinEndDeviceResponse();
            case 64: // ENDPOINT_INFORMATION_COMMAND
                return new EndpointInformationCommand();
            case 66: // GET_ENDPOINT_LIST_RESPONSE
                return new GetEndpointListResponse();
            default:
                return null;
        }
    }
}
