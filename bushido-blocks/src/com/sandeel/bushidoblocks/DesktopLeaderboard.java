/*
	Copyright © 2012 Sandeel Software

	This file is part of Bushido Blocks.

	Bushido Blocks is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.sandeel.bushidoblocks;

import com.badlogic.gdx.Gdx;

public class DesktopLeaderboard implements Leaderboard {
	public void submitScore(int score) {
	   Gdx.app.log("DesktopLeaderboard would have submitted score:", ":" + score);
	}

	public void showLeaderboards() {
	};

	public void showDash() {
	};
}
