/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/ade/containerpage/client/draganddrop/Attic/I_CmsDragContainerElement.java,v $
 * Date   : $Date: 2010/05/05 12:44:47 $
 * Version: $Revision: 1.4 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.ade.containerpage.client.draganddrop;

import org.opencms.gwt.client.draganddrop.I_CmsDragElement;
import org.opencms.gwt.client.draganddrop.I_CmsDragTarget;

/**
 * Extending the draggable for elements with an id.<p>
 * 
 * There may be a better name for this interface...<p>
 * 
 * @param <T> the drag parent type
 * 
 * @author Tobias Herrmann
 * 
 * @version $Revision: 1.4 $
 * 
 * @since 8.0.0
 */
public interface I_CmsDragContainerElement<T extends I_CmsDragTarget> extends I_CmsDragElement<T> {

    /**
     * Clears all properties set for dragging.<p>
     */
    void clearDrag();

    /**
     * Returns the client id.<p>
     *
     * @return the client id
     */
    String getClientId();

    /**
     * Returns the parent drag target.<p>
     * 
     * @return the parent drag target
     */
    T getDragParent();

    /**
     * Prepares the element for dragging.<p>
     */
    void prepareDrag();

    /**
     * Registers a new drag parent.<p>
     * 
     * @param target the new drag parent
     */
    void setDragParent(T target);

    /**
     * Sets whether this object is visible.<p>
     * 
     * @param visible <code>true</code> to show the object, <code>false</code> to hide it
     * 
     * @see com.google.gwt.user.client.ui.UIObject#setVisible(boolean)
     */
    void setVisible(boolean visible);
}