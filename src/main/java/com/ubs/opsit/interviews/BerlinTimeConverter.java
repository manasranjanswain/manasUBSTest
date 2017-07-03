package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.exceptions.BusinessException;

/**
 * The <code>BerlinTimeConverter</code> interface convert
 * given time to Berlin clock standard.
 * 
 */
public interface BerlinTimeConverter {
	
	/**
	 * The <code>convertTime</code> method used for convert 
	 * to the Berlin clock standard format.
	 * @param aTime
	 * @return <code>String</code>
	 * @throws BusinessException
	 */
    public String convertTime(String aTime) throws BusinessException;

}
