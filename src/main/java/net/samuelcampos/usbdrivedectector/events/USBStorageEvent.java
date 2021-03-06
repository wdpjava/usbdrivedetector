/*
 * Copyright 2014 samuelcampos.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.samuelcampos.usbdrivedectector.events;

import net.samuelcampos.usbdrivedectector.USBStorageDevice;

/**
 *
 * @author samuelcampos
 */
public class USBStorageEvent {
    private final USBStorageDevice storageDevice;
    private final DeviceEventType eventType;
    
    public USBStorageEvent(final USBStorageDevice storageDevice, final DeviceEventType eventType) {
        this.storageDevice = storageDevice;
        this.eventType = eventType;
    }
    
    public USBStorageDevice getStorageDevice() {
        return storageDevice;
    }

    public DeviceEventType getEventType() {
        return eventType;
    }

    @Override
    public String toString() {
        return "USBStorageEvent{" + "storageDevice=" + storageDevice + ", eventType=" + eventType + '}';
    }
}
