import 'clay-table';
import 'clay-pagination-bar';
import {Config} from 'metal-state';
import Component from 'metal-component';
import Soy from 'metal-soy';

import template from './CommerceTable.soy';

class CommerceTable extends Component {

	/**
	 * Toggles the selection of an item and adds or removes it from selected items
	 * list.
	 * @param {!Event} event
	 * @private
	 */
	_handleItemToggled(event) {

	}

	_handleItemsPerPageClicked(event) {
		if (this.disableAJAX) {
			return;
		}

		event.preventDefault();

		if (this.pageSize == event.data.item.label) {
			return;
		}

		this.pageSize = event.data.item.label;

		this.paginationSelectedEntry = this.paginationEntries.map(function(x) {
			return x.label;
		}).indexOf(this.pageSize);

		this._loadData();
	}

	_handlePageClicked(event) {
		if (this.disableAJAX) {
			return;
		}


		let newPage = parseInt(event.data.page);

		if (this.currentPage == newPage) {
			return;
		}

		this.currentPage = newPage;

		this._loadData();
	}

	_loadData() {
		fetch(
			this._getApiURL(),
			{
				method: 'GET'
			}
		)
			.then(response => response.json())
			.then(
				updatedItems => {
					this.items = updatedItems;
				}
			)
			.catch(
				err => {
					console.log(err);
				}
			);
	}

	_getApiURL() {
		let url = this.dataSetAPI + '/' + this.groupId + '/' + this.tableName + '/' + this.dataProviderKey + '?';

		url = url + 'pageSize=' + this.pageSize;

		url = url + '&page=' + this.currentPage;

		return url;
	}

}

Soy.register(CommerceTable, template);

CommerceTable.STATE = {
	disableAJAX: Config.bool(),
	groupId: Config.string().required(),
	pageSize: Config.number().required(),
	currentPage: Config.number().required(),
	id: Config.string(),
	items: Config.array().required(),
	paginationBaseHref: Config.string(),
	paginationEntries: Config.array().required(),
	paginationSelectedEntry: Config.number().required(),
	schema: Config.object().required(),
	spritemap: Config.string().required(),
	selectable: Config.bool(),
	tableName: Config.string().required(),
	dataProviderKey: Config.string().required(),
	totalItems: Config.number().required(),
	dataSetAPI: Config.string().required()
};

export {CommerceTable};
export default CommerceTable;