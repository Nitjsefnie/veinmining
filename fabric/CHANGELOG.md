# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/) and this project adheres to [Semantic Versioning](https://semver.org/).

## [0.0.12-1.16.5] - 2022.12.30
### Added
- Added `activationStateWithoutEnchantment` configuration option, defaulted to `"KEYBINDING"`, which controls the
  activation method if `maxBlocksBase` and `maxDistanceBase` values are greater than 0 (which would mean that the
  enchantment is not required for vein mining functionality)
### Changed
- Items that are unbreakable or cannot be damaged now bypass the `limitedByDurability` configuration
- Changed the localization of the activation keybinding from `Activate` to `Activate Vein Mining` for clarity of purpose

## [0.0.11-1.16.5] - 2022.09.01
### Changed
- `maxBlocksBase` and `maxBlocksPerLevel` now account for the origin block [#60](https://github.com/TheIllusiveC4/VeinMining/issues/60)

## [0.0.10-1.16.5] - 2021.11.08
### Changed
- Changed `activationState` and `blocksPermission` config values to include possible values in the json5 comments

## [0.0.9-1.16.5] - 2021.11.08
### Changed
- Changed `rarity` config to include possible values in the json5 comments [#31](https://github.com/TheIllusiveC4/VeinMining/issues/31)
### Fixed
- Fixed `preventToolDestruction` config not being applied correctly [#32](https://github.com/TheIllusiveC4/VeinMining/issues/32)

## [0.0.8-1.16.5] - 2021.06.27
### Fixed
- Fixed config syncing

## [0.0.7-1.16.5] - 2021.03.16
### Added
- Added `KEYBINDING` to activation method config option [#7](https://github.com/TheIllusiveC4/VeinMining/issues/7)

## [0.0.6-1.16.5] - 2021.01.31
### Added
- Added `incompatibleEnchantments` config option

## [0.0.5-1.16.5] - 2021.01.31
### Added
- Added partial Chinese translation (thanks EnterFor!)

## [0.0.4-1.16.4] - 2021.01.12
### Added
- Added partial Brazilian Portuguese translation (thanks Mikeliro!)

## [0.0.3-1.16.4] - 2021.01.10
### Added
- Added configuration option for requireEffectiveTool to limit vein mining only to blocks that the
respective tool is effective on
### Fixed
- Fixed groups configuration appending itself upon load
- Fixed missing lang keys for some config gui options

## [0.0.2-1.16.4] - 2020.12.30
### Added
- Added configuration options for maxBlocksBase and maxDistanceBase for granting vein mining
abilities without the enchantment

## [0.0.1-1.16.4] - 2020.12.28
Initial beta release
