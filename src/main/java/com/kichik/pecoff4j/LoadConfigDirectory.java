/*******************************************************************************
 * This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Peter Smith
 *******************************************************************************/
package com.kichik.pecoff4j;

import com.kichik.pecoff4j.util.DataObject;

public class LoadConfigDirectory extends DataObject {
	private int size;
	private int timeDateStamp;
	private int majorVersion;
	private int minorVersion;
	private int globalFlagsClear;
	private int globalFlagsSet;
	private int criticalSectionDefaultTimeout;
	private long deCommitFreeBlockThreshold;
	private long deCommitTotalFreeThreshold;
	private long lockPrefixTable;
	private long maximumAllocationSize;
	private long virtualMemoryThreshold;
	private long processAffinityMask;
	private int processHeapFlags;
	private int csdVersion;
	private int reserved;
	private long editList;
	private long securityCookie;
	private long seHandlerTable;
	private long seHandlerCount;

	public int getSize() {
		return size;
	}

	public int getTimeDateStamp() {
		return timeDateStamp;
	}

	public int getMajorVersion() {
		return majorVersion;
	}

	public int getMinorVersion() {
		return minorVersion;
	}

	public int getGlobalFlagsClear() {
		return globalFlagsClear;
	}

	public int getGlobalFlagsSet() {
		return globalFlagsSet;
	}

	public int getCriticalSectionDefaultTimeout() {
		return criticalSectionDefaultTimeout;
	}

	public long getDeCommitFreeBlockThreshold() {
		return deCommitFreeBlockThreshold;
	}

	public long getDeCommitTotalFreeThreshold() {
		return deCommitTotalFreeThreshold;
	}

	public long getLockPrefixTable() {
		return lockPrefixTable;
	}

	public long getMaximumAllocationSize() {
		return maximumAllocationSize;
	}

	public long getVirtualMemoryThreshold() {
		return virtualMemoryThreshold;
	}

	public long getProcessAffinityMask() {
		return processAffinityMask;
	}

	public int getProcessHeapFlags() {
		return processHeapFlags;
	}

	public int getCsdVersion() {
		return csdVersion;
	}

	public int getReserved() {
		return reserved;
	}

	public long getEditList() {
		return editList;
	}

	public long getSecurityCookie() {
		return securityCookie;
	}

	public long getSeHandlerTable() {
		return seHandlerTable;
	}

	public long getSeHandlerCount() {
		return seHandlerCount;
	}

	public void setSize(int characteristics) {
		this.size = characteristics;
	}

	public void setTimeDateStamp(int timeDateStamp) {
		this.timeDateStamp = timeDateStamp;
	}

	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}

	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}

	public void setGlobalFlagsClear(int globalFlagsClear) {
		this.globalFlagsClear = globalFlagsClear;
	}

	public void setGlobalFlagsSet(int globalFlagsSet) {
		this.globalFlagsSet = globalFlagsSet;
	}

	public void setCriticalSectionDefaultTimeout(
			int criticalSectionDefaultTimeout) {
		this.criticalSectionDefaultTimeout = criticalSectionDefaultTimeout;
	}

	public void setDeCommitFreeBlockThreshold(long deCommitFreeBlockThreshold) {
		this.deCommitFreeBlockThreshold = deCommitFreeBlockThreshold;
	}

	public void setDeCommitTotalFreeThreshold(long deCommitTotalFreeThreshold) {
		this.deCommitTotalFreeThreshold = deCommitTotalFreeThreshold;
	}

	public void setLockPrefixTable(long lockPrefixTable) {
		this.lockPrefixTable = lockPrefixTable;
	}

	public void setMaximumAllocationSize(long maximumAllocationSize) {
		this.maximumAllocationSize = maximumAllocationSize;
	}

	public void setVirtualMemoryThreshold(long virtualMemoryThreshold) {
		this.virtualMemoryThreshold = virtualMemoryThreshold;
	}

	public void setProcessAffinityMask(long processAffinityMask) {
		this.processAffinityMask = processAffinityMask;
	}

	public void setProcessHeapFlags(int processHeapFlags) {
		this.processHeapFlags = processHeapFlags;
	}

	public void setCsdVersion(int csdVersion) {
		this.csdVersion = csdVersion;
	}

	public void setReserved(int reserved) {
		this.reserved = reserved;
	}

	public void setEditList(long editList) {
		this.editList = editList;
	}

	public void setSecurityCookie(long securityCookie) {
		this.securityCookie = securityCookie;
	}

	public void setSeHandlerTable(long seHandlerTable) {
		this.seHandlerTable = seHandlerTable;
	}

	public void setSeHandlerCount(long seHandlerCount) {
		this.seHandlerCount = seHandlerCount;
	}
}
